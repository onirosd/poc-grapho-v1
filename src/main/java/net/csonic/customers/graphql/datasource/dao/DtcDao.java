package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DtcEntity;

import java.util.List;

public interface DtcDao {

    List<DtcEntity> findByTelefonoKeyIdbc(String id);
    List<DtcEntity> findByTelefonoKeyIdbcPriority(String id);


}
