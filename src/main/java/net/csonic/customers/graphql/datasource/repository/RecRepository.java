package net.csonic.customers.graphql.datasource.repository;

import net.csonic.customers.graphql.datasource.entity.RecEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecRepository extends JpaRepository<RecEntity, String> {

        List<RecEntity> findByRecCicIcli(String recCicIcli);

}
