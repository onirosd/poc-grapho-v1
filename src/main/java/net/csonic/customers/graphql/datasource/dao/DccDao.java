package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DccEntity;
// import reactor.core.publisher.Mono;
// import reactor.core.publisher.Flux;
import java.util.List;
// import reactor.core.publisher.Mono;

public interface DccDao {

    List<DccEntity> findCorreosByCorreoKeyIdbc(String id);
    List<DccEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc);
}
