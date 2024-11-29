package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DccEntity;
import net.csonic.customers.graphql.datasource.repository.DccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DccDaoImpl implements DccDao {

    @Autowired
    private DccRepository dccRepository;

    public List<DccEntity> findCorreosByCorreoKeyIdbc(String correoKeyIdbc) {
        return this.dccRepository.findByDccCic(correoKeyIdbc);
    }

    public List<DccEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc) {
        return this.dccRepository.findByDccCicPriority(correoKeyIdbc);
    }


}

