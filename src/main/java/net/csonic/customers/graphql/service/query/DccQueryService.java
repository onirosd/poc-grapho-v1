package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.DccDao;
import net.csonic.customers.graphql.datasource.entity.DccEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DccQueryService {

    private final DccDao dccDao;

    public DccQueryService(DccDao dccDao) {
        this.dccDao = dccDao;
    }

    public List<DccEntity> findByCorreoKeyIdbc(String correoKeyIdbc) {
        return dccDao.findCorreosByCorreoKeyIdbc(correoKeyIdbc);
    }

    public List<DccEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc) {
        return dccDao.findByCorreoKeyIdbcPriority(correoKeyIdbc);
    }

}
