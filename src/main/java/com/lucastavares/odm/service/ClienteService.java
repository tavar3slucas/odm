package com.lucastavares.odm.service;

import com.lucastavares.odm.domain.Categoria;
import com.lucastavares.odm.domain.Cliente;
import com.lucastavares.odm.repository.ClienteRepository;
import com.lucastavares.odm.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService  {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ! Id : " + id +
                ", Tipo: "+ Categoria.class.getName()));
    }
}
