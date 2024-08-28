package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.DcpEntity;
import net.csonic.customers.graphql.datasource.repository.DcpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DcpDaoImpl implements DcpDao {

    @Autowired
    private DcpRepository dcpRepository;

    public Optional<DcpEntity> findDcpById(String idDbc) {
        // System.out.println("IDCP -> " + idDbc);
        Optional<DcpEntity> result = this.dcpRepository.findById(idDbc);
        if (result.isPresent()) {
            System.out.println("Buscando en IDCP: " + idDbc);
        } else {
            throw new RuntimeException("No entity found with ID: " + idDbc);
        }
        return result;
    }
}
