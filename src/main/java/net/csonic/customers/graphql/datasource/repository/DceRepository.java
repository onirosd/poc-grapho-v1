package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import net.csonic.customers.graphql.datasource.entity.DceEntity;
import net.csonic.customers.graphql.datasource.entity.DcpEntity;

import java.util.List;
import java.util.Optional;


@Repository
public interface DceRepository extends JpaRepository<DceEntity, String> {

    Optional<DceEntity> findById(String id);

    @Query("SELECT d FROM DceEntity d WHERE " +
        "d.dceKeyIdce = :id AND " +
        "(:fullName IS NULL OR d.dceGlsNfan LIKE %:fullName%)  ")
    Optional<DceEntity> findByIdAndFullName(@Param("id") String id, @Param("fullName") String fullName);

    // Mono<DceEntity> findByCicAndPersonId(String cic, String personId);

    // Mono<DceEntity> findByPersonId(String personId);

}
