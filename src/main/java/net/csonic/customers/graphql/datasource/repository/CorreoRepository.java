package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface CorreoRepository extends JpaRepository<CorreoEntity, String> {

    List<CorreoEntity> findByCorreoKeyIdbc(String correoKeyIdbc);

    @Query("SELECT c FROM CorreoEntity c WHERE c.correoKeyIdbc = :correoKeyIdbc AND c.correoPrioridad = 1")
    List<CorreoEntity> findByCorreoKeyIdbcPriority(@Param("correoKeyIdbc") String correoKeyIdbc);

}
