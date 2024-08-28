package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.TelefonoDao;
import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoQueryService {

    private final TelefonoDao telefonoDao;

    public TelefonoQueryService(TelefonoDao telefonoDao) {
        this.telefonoDao = telefonoDao;
    }

    public List<TelefonoEntity> findById(String id) {
        return telefonoDao.findByTelefonoKeyIdbc(id);
    }

    public List<TelefonoEntity> findByIdPriority(String id) {
        return telefonoDao.findByTelefonoKeyIdbcPriority(id);
    }

    
}
