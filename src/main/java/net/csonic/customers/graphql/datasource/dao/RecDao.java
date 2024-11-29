package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.RecEntity;
import java.util.List;

public interface RecDao {

    List<RecEntity> findRelationsById(String id);
}
