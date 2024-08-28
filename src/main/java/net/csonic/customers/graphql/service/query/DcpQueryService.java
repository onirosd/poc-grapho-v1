package net.csonic.customers.graphql.service.query;
import net.csonic.customers.graphql.datasource.dao.DcpDao;

import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.*;


@Service
public class DcpQueryService {

  private final DcpDao dcpDao;

    public DcpQueryService(DcpDao customerDao) {
        this.dcpDao = customerDao;
    }

    public Optional<DcpEntity> findById(String id) {
        return dcpDao.findDcpById(id);
    }
    
}
