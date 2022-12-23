package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Cidade;
import com.lucastavares.odm.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
