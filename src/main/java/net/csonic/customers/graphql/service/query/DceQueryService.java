package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.DceDao;

import net.csonic.customers.graphql.datasource.entity.DceEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class DceQueryService {

    private final DceDao dceDao;

    public DceQueryService(DceDao dceDao) {
        this.dceDao = dceDao;
    }

    public Optional<DceEntity> findById(String id) {
        return dceDao.findDceById(id);
    }
}
