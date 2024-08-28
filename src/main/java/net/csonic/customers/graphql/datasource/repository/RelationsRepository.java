package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import net.csonic.customers.graphql.datasource.entity.RelationsEntity;
import java.util.List;

@Repository
public interface RelationsRepository extends JpaRepository<RelationsEntity, String> {

        List<RelationsEntity> findByRecCicIcli(String recCicIcli);

}
