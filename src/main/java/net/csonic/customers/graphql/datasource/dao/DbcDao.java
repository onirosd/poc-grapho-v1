package net.csonic.customers.graphql.datasource.dao;
import java.util.Map;
import net.csonic.customers.graphql.datasource.entity.DbcEntity;
import java.util.Optional;

public interface DbcDao {

    Optional<DbcEntity> findDbcById(String id);
    Optional<DbcEntity> findByIdAndDbcIdcIcli(String dbcKeyIreg, String dbcIdcIcli);
    Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerType(String cic, String personId , String customerType, String firstName, String secondName, String fatherName, String motherName, String birthDate , String birthPlace);
    Map<String, Object> findDbcDceDcpByCicAndPersonIdAndCustomerTypePj(String cic, String personId , String customerType, String fullName);


    
}