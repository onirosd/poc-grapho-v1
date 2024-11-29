package net.csonic.customers.graphql.datasource.repository;

import net.csonic.customers.graphql.datasource.entity.DdcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface DdcRepository extends JpaRepository<DdcEntity, String> {

    // Consulta derivada basada en la propiedad ddcCic
    List<DdcEntity> findByDdcCic(String ddcCic);

    // Consulta personalizada con filtros opcionales
    @Query("SELECT d FROM DdcEntity d WHERE d.ddcCic = :ddcCic AND (:ddcMscTdir IS NULL OR d.ddcMscTdir = :ddcMscTdir)")
    List<DdcEntity> findDirebyCicandType(@Param("ddcCic") String ddcCic, @Param("ddcMscTdir") String ddcMscTdir);

    // Consulta personalizada con prioridad
    @Query("SELECT d FROM DdcEntity d WHERE d.ddcCic = :ddcCic AND (:ddcMscTdir IS NULL OR d.ddcMscTdir = :ddcMscTdir) AND d.ddcPrioridad = 1")
    List<DdcEntity> findDirebyCicandTypePriority(@Param("ddcCic") String ddcCic, @Param("ddcMscTdir") String ddcMscTdir);
}
