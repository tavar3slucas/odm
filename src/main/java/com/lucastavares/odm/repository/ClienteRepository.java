package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Categoria;
import com.lucastavares.odm.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
