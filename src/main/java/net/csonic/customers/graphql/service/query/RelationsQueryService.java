package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.RelationsDao;
import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationsQueryService {

    private final RelationsDao relationsDao;

    public RelationsQueryService(RelationsDao relationsDao) {
        this.relationsDao = relationsDao;
    }

    public List<RelationsEntity> findById(String id) {
        return relationsDao.findRelationsById(id);
    }
}
