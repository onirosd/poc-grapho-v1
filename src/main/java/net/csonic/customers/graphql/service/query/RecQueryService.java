package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.RecDao;
import net.csonic.customers.graphql.datasource.entity.RecEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecQueryService {

    private final RecDao recDao;

    public RecQueryService(RecDao recDao) {
        this.recDao = recDao;
    }

    public List<RecEntity> findById(String id) {
        return recDao.findRelationsById(id);
    }
}
