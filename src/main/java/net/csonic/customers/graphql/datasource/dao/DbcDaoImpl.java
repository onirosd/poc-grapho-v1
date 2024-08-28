package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import net.csonic.customers.graphql.datasource.entity.DceEntity;
import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import net.csonic.customers.graphql.datasource.repository.DbcRepository;
import net.csonic.customers.graphql.datasource.repository.DceRepository;
import net.csonic.customers.graphql.datasource.repository.DcpRepository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import org.springframework.util.StringUtils;

import jakarta.persistence.criteria.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Tuple;

import java.util.Optional;




@Component
public class DbcDaoImpl implements DbcDao {

    @Autowired
    private DbcRepository dbcRepository;
    @Autowired
    private DceRepository dceRepository;
    @Autowired
    private DcpRepository dcpRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public Optional<DbcEntity> findDbcById(String idDbc) {
        // System.out.println("idDbc -> " + idDbc);
        Optional<DbcEntity> result = dbcRepository.findById(idDbc);
        if (result.isPresent()) {
            System.out.println("Entity found with ID: " + idDbc);
        } else {
            System.out.println("No entity found with ID: " + idDbc);
        }
        return result;
    }


    public Optional<DbcEntity> findByIdAndDbcIdcIcli(String dbcKeyIreg, String dbcIdcIcli) {
        if (dbcKeyIreg != null && dbcIdcIcli != null) {
            return dbcRepository.findByDbcKeyIregAndDbcIdcIcli(dbcKeyIreg, dbcIdcIcli);
        } else if (dbcKeyIreg != null) {
            return dbcRepository.findByDbcKeyIreg(dbcKeyIreg);
        } else if (dbcIdcIcli != null) {
            return dbcRepository.findByDbcIdcIcli(dbcIdcIcli);
        } else {
            throw new IllegalArgumentException("Ambos dbcKeyIreg y dbcIdcIcli no pueden ser nulos");
        }
    }
    
     
    @Override
    public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerType(String cic, String personId, String customerType,
                                                                            String firstName, String secondName, String fatherName,
                                                                            String motherName, String birthDate, String birthPlace) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<DbcEntity> query = cb.createQuery(DbcEntity.class);
        Root<DbcEntity> root = query.from(DbcEntity.class);

        Predicate predicate = cb.conjunction();

        if (cic != null) {
            predicate = cb.and(predicate, cb.equal(root.get("dbcKeyIreg"), cic));
        }
        if (personId != null) {
            predicate = cb.and(predicate, cb.equal(root.get("dbcIdcIcli"), personId));
        }
        if (customerType != null) {
            predicate = cb.and(predicate, cb.equal(root.get("dbcCodTicl"), customerType));
        }
        if (firstName != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dbcGlsNomPrimer")), "%" + firstName.toLowerCase() + "%"));
        }
        if (secondName != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dbcGlsNomSegundo")), "%" + secondName.toLowerCase() + "%"));
        }
        if (fatherName != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dbcGlsApat")), "%" + fatherName.toLowerCase() + "%"));
        }
        if (motherName != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dbcGlsAmat")), "%" + motherName.toLowerCase() + "%"));
        }

        query.where(predicate);

        Optional<DbcEntity> dbcEntityOptional = Optional.ofNullable(entityManager.createQuery(query).getSingleResult());
        Optional<DceEntity> dceEntityOptional = Optional.empty();
        Optional<DcpEntity> dcpEntityOptional = Optional.empty();

        if (dbcEntityOptional.isPresent()) {
            String dbcKeyIreg = dbcEntityOptional.get().getDbcKeyIreg();
            dceEntityOptional = dceRepository.findById(dbcKeyIreg);
            dcpEntityOptional = findDcpEntity(dbcKeyIreg, birthDate, birthPlace);
        } else {
            throw new IllegalArgumentException("No se encontró DbcEntity con los criterios proporcionados.");
        }

        Map<String, Object> entities = new HashMap<>();
        dbcEntityOptional.ifPresent(dbcEntity -> entities.put("dbc", dbcEntity));
        dceEntityOptional.ifPresent(dceEntity -> entities.put("dce", dceEntity));
        dcpEntityOptional.ifPresent(dcpEntity -> entities.put("dcp", dcpEntity));

        return entities;
    }

    private Optional<DcpEntity> findDcpEntity(String dbcKeyIreg, String birthDate, String birthPlace) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<DcpEntity> query = cb.createQuery(DcpEntity.class);
        Root<DcpEntity> root = query.from(DcpEntity.class);

        Predicate predicate = cb.equal(root.get("dcpKeyIdcp"), dbcKeyIreg);

        if (birthDate != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dcpFecFnac")), "%" + birthDate.toLowerCase() + "%"));
        }
        if (birthPlace != null) {
            predicate = cb.and(predicate, cb.like(cb.lower(root.get("dcpLugNaci")), "%" + birthPlace.toLowerCase() + "%"));
        }

        query.where(predicate);

        return Optional.ofNullable(entityManager.createQuery(query).getSingleResult());
    }

 
    // public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerType(String cic, String personId, String customerType, String firstName, String secondName, String fatherName, String motherName , String birthDate , String birthPlace) {
    //     Optional<DbcEntity> dbcEntityOptional;
    //     Optional<DceEntity> dceEntityOptional = Optional.empty();
    //     Optional<DcpEntity> dcpEntityOptional = Optional.empty();
    
    //     // Verifica si alguno de cic, personId o customerType están presentes
    //     if (cic != null || personId != null || customerType != null || firstName != null || secondName != null || fatherName != null || motherName != null) {
    //         dbcEntityOptional = dbcRepository.findByDbcKeyIregAndDbcIdcIcliDbcCodTicl(cic, personId, customerType, firstName, secondName, fatherName, motherName);
    
    //         if (dbcEntityOptional.isPresent()) {
    //             String dbcKeyIreg = dbcEntityOptional.get().getDbcKeyIreg();
    //             dceEntityOptional = dceRepository.findById(dbcKeyIreg);
    //             dcpEntityOptional = dcpRepository.findByIdAndBirthDateAndBirthPlace(dbcKeyIreg, birthDate , birthPlace);
    //         } else {
    //             throw new IllegalArgumentException("No se encontró DbcEntity con los criterios proporcionados.");
    //         }

    //     } else {
    //         // Si todos cic, personId y customerType están vacíos
    //         throw new IllegalArgumentException("El cic, personId o customerType no pueden estar vacíos.");
    //     }
    
    //     Map<String, Object> entities = new HashMap<>();
    //     dbcEntityOptional.ifPresent(dbcEntity -> entities.put("dbc", dbcEntity));
    //     dceEntityOptional.ifPresent(dceEntity -> entities.put("dce", dceEntity));
    //     dcpEntityOptional.ifPresent(dcpEntity -> entities.put("dcp", dcpEntity));
    
    //     return entities;
    // }


    // @Override
    // public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(String cic, String personId, String customerType, String fullName) {


    //             Optional<DbcEntity> dbcEntityOptional;
    //             Optional<DceEntity> dceEntityOptional = Optional.empty();
    //             Optional<DcpEntity> dcpEntityOptional = Optional.empty();

    //             CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    //             CriteriaQuery<DceEntity> query = cb.createQuery(DceEntity.class);
    //             Root<DceEntity> root = query.from(DceEntity.class);

            
    //             // Verifica si alguno de cic, personId o customerType están presentes
    //             if (cic != null || personId != null || customerType != null || fullName != null ) {
    //                 dbcEntityOptional = dbcRepository.findByDbcKeyIregAndDbcIdcIcliDbcCodTiclPj(cic, personId, customerType);
            
    //                 if (dbcEntityOptional.isPresent()) {
    //                     String dbcKeyIreg = dbcEntityOptional.get().getDbcKeyIreg();
    //                     dceEntityOptional = dceRepository.findByIdAndFullName(dbcKeyIreg, fullName);
    //                     dcpEntityOptional = dcpRepository.findById(dbcKeyIreg);
    //                 } else {
    //                     throw new IllegalArgumentException("No se encontró DbcEntity con los criterios proporcionados.");
    //                 }

    //             } else {
    //                 // Si todos cic, personId y customerType están vacíos
    //                 throw new IllegalArgumentException("El cic, personId o customerType no pueden estar vacíos.");
    //             }
            
    //             Map<String, Object> entities = new HashMap<>();
    //             dbcEntityOptional.ifPresent(dbcEntity -> entities.put("dbc", dbcEntity));
    //             dceEntityOptional.ifPresent(dceEntity -> entities.put("dce", dceEntity));
    //             dcpEntityOptional.ifPresent(dcpEntity -> entities.put("dcp", dcpEntity));
            
    //             return entities;
    // }


    
    @Override
public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(String cic, String personId, String customerType, String fullName) {

    CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    CriteriaQuery<DbcEntity> query = cb.createQuery(DbcEntity.class);
    Root<DbcEntity> dbcRoot = query.from(DbcEntity.class);
    
    // Los joins automáticos ya no necesitan las condiciones manuales
    Join<DbcEntity, DceEntity> dceJoin = dbcRoot.join("dceEntity", JoinType.LEFT);
    Join<DbcEntity, DcpEntity> dcpJoin = dbcRoot.join("dcpEntity", JoinType.LEFT);

    Predicate predicate = cb.conjunction();

    if (cic != null) {
        predicate = cb.and(predicate, cb.equal(dbcRoot.get("dbcKeyIreg"), cic));
    }
    if (personId != null) {
        predicate = cb.and(predicate, cb.equal(dbcRoot.get("dbcIdcIcli"), personId));
    }
    if (customerType != null) {
        predicate = cb.and(predicate, cb.equal(dbcRoot.get("dbcCodTicl"), customerType));
    }
    if (fullName != null) {
        predicate = cb.and(predicate, cb.like(cb.lower(dceJoin.get("dceGlsNfan")), "%" + fullName.toLowerCase() + "%"));
    }

    query.select(dbcRoot).where(predicate);

    DbcEntity result = entityManager.createQuery(query).getSingleResult();

    Map<String, Object> entities = new HashMap<>();
    entities.put("dbc", result);
    entities.put("dce", result.getDceEntity());
    entities.put("dcp", result.getDcpEntity());

    return entities;
}


}
