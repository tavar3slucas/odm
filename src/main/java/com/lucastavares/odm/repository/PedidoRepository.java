package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Pedido;
import com.lucastavares.odm.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
