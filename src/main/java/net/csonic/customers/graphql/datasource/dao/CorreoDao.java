package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
// import reactor.core.publisher.Mono;
// import reactor.core.publisher.Flux;
import java.util.List;
// import reactor.core.publisher.Mono;

public interface CorreoDao {

    List<CorreoEntity> findCorreosByCorreoKeyIdbc(String id);
    List<CorreoEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc);
}
