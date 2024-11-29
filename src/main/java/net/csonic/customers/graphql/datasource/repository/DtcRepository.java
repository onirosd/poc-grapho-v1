package net.csonic.customers.graphql.datasource.repository;

import net.csonic.customers.graphql.datasource.entity.DtcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface DtcRepository extends JpaRepository<DtcEntity, String> {
    // Consulta derivada basada en la propiedad dtcCic
    List<DtcEntity> findByDtcCic(String dtcCic);

    // Consulta personalizada con JPQL
    @Query("SELECT d FROM DtcEntity d WHERE d.dtcCic = :dtcCic AND d.dtcPrioridad = 1")
    List<DtcEntity> findByDtcCicPriority(@Param("dtcCic") String dtcCic);
}
