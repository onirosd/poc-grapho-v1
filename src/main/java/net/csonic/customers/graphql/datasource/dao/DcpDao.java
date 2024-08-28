package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import java.util.Optional;

public interface DcpDao {

    Optional<DcpEntity> findDcpById(String id);
}
