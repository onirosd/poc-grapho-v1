package net.csonic.customers.graphql.datasource.dao;

import net.csonic.customers.graphql.datasource.entity.TelefonoEntity;
import net.csonic.customers.graphql.datasource.repository.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TelefonoDaoImpl implements TelefonoDao {

    @Autowired
    private TelefonoRepository telefonoRepository;

    public List<TelefonoEntity> findByTelefonoKeyIdbc(String id) {
        return this.telefonoRepository.findByTelefonoKeyIdbc(id);
    }

    public List<TelefonoEntity> findByTelefonoKeyIdbcPriority(String id) {
        return this.telefonoRepository.findByTelefonoKeyIdbcPriority(id);
    }
}
