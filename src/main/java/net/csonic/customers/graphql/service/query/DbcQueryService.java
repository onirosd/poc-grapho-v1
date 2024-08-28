package net.csonic.customers.graphql.service.query;
import net.csonic.customers.graphql.datasource.dao.DbcDao;

import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import org.springframework.stereotype.Service;
// import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Optional;
import java.util.Map;



@Service
public class DbcQueryService {

    private final DbcDao dbcDao;


    public DbcQueryService(DbcDao customerDao) {
        this.dbcDao = customerDao;
    }

    public Optional<DbcEntity> findById(String id) {
        return dbcDao.findDbcById(id);
    }

    public Optional<DbcEntity> findByIdAndDbcIdcIcli(String dbcKeyIreg, String dbcIdcIcli) {
        return dbcDao.findByIdAndDbcIdcIcli(dbcKeyIreg, dbcIdcIcli);
    }


    public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerType(String cic, String personId, String customerType, String firstName, String secondName, String fatherName, String motherName, String birthDate , String birthPlace) {
        return dbcDao.findDbcDceDcpByCicAndPersonIdAndCustomerType(cic, personId, customerType, firstName, secondName, fatherName, motherName, birthDate, birthPlace);

    }

    public Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(String cic, String personId, String customerType, String fullName) {
        return dbcDao.findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(cic, personId, customerType, fullName);

    }



    

    
}
