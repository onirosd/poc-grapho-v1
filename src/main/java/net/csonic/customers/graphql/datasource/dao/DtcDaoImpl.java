package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DtcEntity;
import net.csonic.customers.graphql.datasource.repository.DtcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DtcDaoImpl implements DtcDao {

    @Autowired
    private DtcRepository dtcRepository;

    public List<DtcEntity> findByTelefonoKeyIdbc(String id) {
        return this.dtcRepository.findByDtcCic(id);
    }

    public List<DtcEntity> findByTelefonoKeyIdbcPriority(String id) {
        return this.dtcRepository.findByDtcCicPriority(id);
    }
}
