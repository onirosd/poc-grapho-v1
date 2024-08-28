package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DireEntity;
import java.util.List;

public interface DireDao {


    List<DireEntity> findByDireKeyIreg(String cic);
    List<DireEntity> findDirexCicxType(String cic , String type);
}
