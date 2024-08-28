package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.CorreoDao;
import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorreoQueryService {

    private final CorreoDao correoDao;

    public CorreoQueryService(CorreoDao correoDao) {
        this.correoDao = correoDao;
    }

    public List<CorreoEntity> findByCorreoKeyIdbc(String correoKeyIdbc) {
        return correoDao.findCorreosByCorreoKeyIdbc(correoKeyIdbc);
    }

    public List<CorreoEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc) {
        return correoDao.findByCorreoKeyIdbcPriority(correoKeyIdbc);
    }
    
}
