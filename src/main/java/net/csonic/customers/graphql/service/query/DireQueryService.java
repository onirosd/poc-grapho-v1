package net.csonic.customers.graphql.service.query;

import net.csonic.customers.graphql.datasource.dao.DireDao;
import net.csonic.customers.graphql.datasource.entity.DireEntity;
import org.springframework.stereotype.Service;
import java.util.List;
// import reactor.core.publisher.Flux;
// import reactor.core.publisher.Mono;

@Service
public class DireQueryService {
 private final DireDao direDao;

 public DireQueryService(DireDao customerDao) {
        this.direDao = customerDao;
    }

    public List<DireEntity> findDirexCic(String cic ) {
        return direDao.findByDireKeyIreg(cic);
    }

    public List<DireEntity> findDirexCicxType(String cic , String type) {
        return direDao.findDirexCicxType(cic, type);
    }

    
}
