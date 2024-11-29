package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DdcEntity;

import java.util.List;

public interface DdcDao {


    List<DdcEntity> findByDireKeyIreg(String cic);
    List<DdcEntity> findDirexCicxType(String cic , String type);
}
