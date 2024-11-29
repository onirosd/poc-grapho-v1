package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.DdcDao;
import net.csonic.customers.graphql.datasource.entity.DdcEntity;
import org.springframework.stereotype.Service;
import java.util.List;
// import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

@Service
public class DdcQueryService {
    private final DdcDao ddcDao;

    public DdcQueryService(DdcDao customerDao) {
        this.ddcDao = customerDao;
    }

    public List<DdcEntity> findDirexCic(String cic ) {
        return ddcDao.findByDireKeyIreg(cic);
    }

    public List<DdcEntity> findDirexCicxType(String cic , String type) {
        return ddcDao.findDirexCicxType(cic, type);
    }


}
