package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import net.csonic.customers.graphql.datasource.repository.RelationsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RelationsDaoImpl implements RelationsDao {

    @Autowired
    private RelationsRepository relationsRepository;

    public List<RelationsEntity> findRelationsById(String id) {
        return this.relationsRepository.findByRecCicIcli(id);
    }
}
