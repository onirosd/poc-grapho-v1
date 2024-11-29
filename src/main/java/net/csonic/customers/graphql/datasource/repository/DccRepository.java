package net.csonic.customers.graphql.datasource.repository;

import net.csonic.customers.graphql.datasource.entity.DccEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface DccRepository extends JpaRepository<DccEntity, String> {

    // Consulta derivada basada en la propiedad dccCic
    List<DccEntity> findByDccCic(String dccCic);

    // Consulta personalizada con JPQL
    @Query("SELECT c FROM DccEntity c WHERE c.dccCic = :dccCic AND c.dccPrioridad = 1")
    List<DccEntity> findByDccCicPriority(@Param("dccCic") String dccCic);
}
