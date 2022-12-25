package com.lucastavares.odm.service;

import com.lucastavares.odm.domain.Categoria;
import com.lucastavares.odm.domain.Pedido;
import com.lucastavares.odm.repository.PedidoRepository;
import com.lucastavares.odm.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido findById(Integer id){
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("O pedido com o id: " + id +
                ", Tipo: "+ Categoria.class.getName()));
    }
}
