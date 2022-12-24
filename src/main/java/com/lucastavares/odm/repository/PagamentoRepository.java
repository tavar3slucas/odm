package com.lucastavares.odm.repository;

import com.lucastavares.odm.domain.Pagamento;
import com.lucastavares.odm.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
