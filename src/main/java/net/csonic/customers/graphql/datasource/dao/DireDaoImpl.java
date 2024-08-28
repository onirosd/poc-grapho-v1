package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DireEntity;
import net.csonic.customers.graphql.datasource.repository.DireRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DireDaoImpl implements DireDao {

    @Autowired
    private DireRepository direRepository;

    public List<DireEntity> findDirexCicxType(String cic, String type) {
        return this.direRepository.findDirebyCicandTypePriority(cic, type);
    }

    @Override
    public List<DireEntity> findByDireKeyIreg(String cic) {
        return this.direRepository.findByDireKeyIreg(cic);
    }
}
