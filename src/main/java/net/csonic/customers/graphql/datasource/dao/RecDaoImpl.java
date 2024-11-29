package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.RecEntity;

import net.csonic.customers.graphql.datasource.repository.RecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecDaoImpl implements RecDao {

    @Autowired
    private RecRepository relationsRepository;

    public List<RecEntity> findRelationsById(String id) {
        return this.relationsRepository.findByRecCicIcli(id);
    }
}
