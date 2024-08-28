package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import java.util.List;
import java.util.Optional;

@Repository
public interface DbcRepository extends JpaRepository<DbcEntity, String> {

    Optional<DbcEntity> findById(String id);
     // Búsqueda por DBC_KEY_IREG
    Optional<DbcEntity> findByDbcKeyIreg(String dbcKeyIreg);
    // Búsqueda por DBC_IDC_ICLI
    Optional<DbcEntity> findByDbcIdcIcli(String dbcIdcIcli);


    // Búsqueda combinada por DBC_KEY_IREG y DBC_IDC_ICLI
    @Query("SELECT d FROM DbcEntity d WHERE d.dbcKeyIreg = :dbcKeyIreg AND d.dbcIdcIcli = :dbcIdcIcli")
    Optional<DbcEntity> findByDbcKeyIregAndDbcIdcIcli(String dbcKeyIreg, String dbcIdcIcli);


    @Query("SELECT d FROM DbcEntity d WHERE " +
    "(:dbcKeyIreg IS NULL OR d.dbcKeyIreg = :dbcKeyIreg) AND " +
    "(:dbcIdcIcli IS NULL OR d.dbcIdcIcli = :dbcIdcIcli) AND " +
    "(:dbcCodTicl IS NULL OR d.dbcCodTicl = :dbcCodTicl) AND " +
    "(:firstName IS NULL OR d.dbcGlsNomPrimer LIKE CONCAT('%', COALESCE(:firstName, ''), '%')) AND " +
    "(:secondName IS NULL OR d.dbcGlsNomSegundo LIKE CONCAT('%', COALESCE(:secondName, ''), '%')) AND " +
    "(:fatherName IS NULL OR d.dbcGlsApat LIKE CONCAT('%', COALESCE(:fatherName, ''), '%')) AND " +
    "(:motherName IS NULL OR d.dbcGlsAmat LIKE CONCAT('%', COALESCE(:motherName, ''), '%'))")
    Optional<DbcEntity> findByDbcKeyIregAndDbcIdcIcliDbcCodTicl(@Param("dbcKeyIreg") String dbcKeyIreg,
                                                            @Param("dbcIdcIcli") String dbcIdcIcli,
                                                            @Param("dbcCodTicl") String dbcCodTicl,
                                                            @Param("firstName") String firstName,
                                                            @Param("secondName") String secondName,
                                                            @Param("fatherName") String fatherName,
                                                            @Param("motherName") String motherName);



    @Query("SELECT d FROM DbcEntity d WHERE (:dbcKeyIreg IS NULL OR d.dbcKeyIreg = :dbcKeyIreg) AND " +
        "(:dbcIdcIcli IS NULL OR d.dbcIdcIcli = :dbcIdcIcli) AND " +
        "(:dbcCodTicl IS NULL OR d.dbcCodTicl = :dbcCodTicl)")
    Optional<DbcEntity> findByDbcKeyIregAndDbcIdcIcliDbcCodTiclPj(@Param("dbcKeyIreg") String dbcKeyIreg,
                                                            @Param("dbcIdcIcli") String dbcIdcIcli,
                                                            @Param("dbcCodTicl") String dbcCodTicl);






}
