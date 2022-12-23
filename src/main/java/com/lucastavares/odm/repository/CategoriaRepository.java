package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
