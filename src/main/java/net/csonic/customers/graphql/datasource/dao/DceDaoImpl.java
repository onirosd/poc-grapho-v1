package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DceEntity;
import net.csonic.customers.graphql.datasource.repository.DceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DceDaoImpl implements DceDao {

    @Autowired
    private DceRepository dceRepository;

    public Optional<DceEntity> findDceById(String idDbc) {
        // System.out.println("idDbc -> " + idDbc);
        Optional<DceEntity> result = this.dceRepository.findById(idDbc);
        if (result.isPresent()) {
            System.out.println("Entity found with ID: " + idDbc);
        } else {
            throw new RuntimeException("No entity found with ID: " + idDbc);
        }
        return result;
    }
}
