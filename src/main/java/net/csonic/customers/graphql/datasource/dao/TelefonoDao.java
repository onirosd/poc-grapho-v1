package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;
import java.util.List;

public interface TelefonoDao {

    List<TelefonoEntity> findByTelefonoKeyIdbc(String id);
    List<TelefonoEntity> findByTelefonoKeyIdbcPriority(String id);

    
}
