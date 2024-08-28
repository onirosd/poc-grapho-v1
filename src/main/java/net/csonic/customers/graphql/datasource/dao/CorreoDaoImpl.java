package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.CorreoEntity;
import net.csonic.customers.graphql.datasource.repository.CorreoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CorreoDaoImpl implements CorreoDao {

    @Autowired
    private CorreoRepository correoRepository;

    public List<CorreoEntity> findCorreosByCorreoKeyIdbc(String correoKeyIdbc) {
        return this.correoRepository.findByCorreoKeyIdbc(correoKeyIdbc);
    }
    
    public List<CorreoEntity> findByCorreoKeyIdbcPriority(String correoKeyIdbc) {
        return this.correoRepository.findByCorreoKeyIdbcPriority(correoKeyIdbc);
    }

    
}

