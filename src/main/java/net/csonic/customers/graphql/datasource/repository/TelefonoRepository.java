package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;

import java.util.List;

@Repository
public interface TelefonoRepository extends JpaRepository<TelefonoEntity, String> {
    List<TelefonoEntity> findByTelefonoKeyIdbc(String telefonoKeyIdbc);

    @Query("SELECT d FROM TelefonoEntity d WHERE d.telefonoKeyIdbc = :telefonoKeyIdbc AND d.telefonoPrioridad = 1")
    List<TelefonoEntity> findByTelefonoKeyIdbcPriority(@Param("telefonoKeyIdbc") String telefonoKeyIdbc);

}
