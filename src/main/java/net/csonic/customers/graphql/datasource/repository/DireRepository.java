package net.csonic.customers.graphql.datasource.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import net.csonic.customers.graphql.datasource.entity.DireEntity;
import java.util.List;

@Repository
public interface DireRepository extends JpaRepository<DireEntity, String> {

    List<DireEntity> findByDireKeyIreg(String direKeyIreg);

    // Búsqueda combinada por DBC_KEY_IREG y DBC_IDC_ICLI
    @Query("SELECT d FROM DireEntity d WHERE d.direKeyIreg = :direKeyIreg AND (:direMscTdir IS NULL OR d.direMscTdir = :direMscTdir)")
    List<DireEntity> findDirebyCicandType(@Param("direKeyIreg") String direKeyIreg, @Param("direMscTdir") String direMscTdir);
    
    @Query("SELECT d FROM DireEntity d WHERE d.direKeyIreg = :direKeyIreg AND (:direMscTdir IS NULL OR d.direMscTdir = :direMscTdir) AND d.prioridadDire = 1 ")
    List<DireEntity> findDirebyCicandTypePriority(@Param("direKeyIreg") String direKeyIreg, @Param("direMscTdir") String direMscTdir);
}
