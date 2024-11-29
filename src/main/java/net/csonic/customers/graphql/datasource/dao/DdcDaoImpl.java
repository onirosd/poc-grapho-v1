package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DdcEntity;
import net.csonic.customers.graphql.datasource.repository.DdcRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DdcDaoImpl implements DdcDao {

    @Autowired
    private DdcRepository ddcRepository;

    public List<DdcEntity> findDirexCicxType(String cic, String type) {
        return this.ddcRepository.findDirebyCicandTypePriority(cic, type);
    }

    @Override
    public List<DdcEntity> findByDireKeyIreg(String cic) {
        return this.ddcRepository.findByDdcCic(cic);
    }
}
