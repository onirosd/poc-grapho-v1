package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import java.util.List;

public interface RelationsDao {

    List<RelationsEntity> findRelationsById(String id);
}
