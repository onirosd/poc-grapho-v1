package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.DtcDao;
import net.csonic.customers.graphql.datasource.entity.DtcEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DtcQueryService {

    private final DtcDao dtcDao;

    public DtcQueryService(DtcDao dtcDao) {
        this.dtcDao = dtcDao;
    }

    public List<DtcEntity> findById(String id) {
        return dtcDao.findByTelefonoKeyIdbc(id);
    }

    public List<DtcEntity> findByIdPriority(String id) {
        return dtcDao.findByTelefonoKeyIdbcPriority(id);
    }


}
