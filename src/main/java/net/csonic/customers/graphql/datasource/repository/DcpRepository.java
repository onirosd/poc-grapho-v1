package net.csonic.customers.graphql.datasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import net.csonic.customers.graphql.datasource.entity.DcpEntity;

import java.util.List;
import java.util.Optional;


@Repository
public interface DcpRepository extends JpaRepository<DcpEntity, String> {

    Optional<DcpEntity> findById(String id);

    @Query("SELECT d FROM DcpEntity d WHERE " +
           "d.dcpKeyIdcp = :id AND " +
           "(:birthDate IS NULL OR d.dcpFecFnac LIKE %:birthDate%) AND " +
           "(:birthPlace IS NULL OR d.dcpLugNaci LIKE %:birthPlace%)")
    Optional<DcpEntity> findByIdAndBirthDateAndBirthPlace(@Param("id") String id,
                                                          @Param("birthDate") String birthDate,
                                                          @Param("birthPlace") String birthPlace);

}
