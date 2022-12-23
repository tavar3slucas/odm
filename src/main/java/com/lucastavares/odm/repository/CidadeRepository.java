package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Categoria;
import com.lucastavares.odm.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
