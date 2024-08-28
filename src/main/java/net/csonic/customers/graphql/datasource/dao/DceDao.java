package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DceEntity;
import java.util.Optional;

public interface DceDao {
    Optional<DceEntity> findDceById(String id);
}
