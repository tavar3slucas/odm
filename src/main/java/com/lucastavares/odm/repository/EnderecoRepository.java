package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Cliente;
import com.lucastavares.odm.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
