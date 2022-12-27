package com.lucastavares.odm.service;

import com.lucastavares.odm.controller.dto.CategoriaDTO;
import com.lucastavares.odm.domain.Categoria;
import com.lucastavares.odm.repository.CategoriaRepository;
import com.lucastavares.odm.service.exceptions.DataIntegrityExcepction;
import com.lucastavares.odm.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repo;

    public Categoria find(Integer id){
     Optional<Categoria> obj = repo.findById(id);
     return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ! Id : " + id +
             ", Tipo: "+ Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id) {
        find(id);
       try {
           repo.deleteById(id);
       } catch (DataIntegrityViolationException e){
            throw new DataIntegrityExcepction("Não é possível excluir uma categoria com produtos vinculados");
       }
    }
    public List<Categoria> findAll() {
        return repo.findAll();
    }

    public Page<Categoria> findPage(Integer page, Integer size, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.valueOf(direction),
                orderBy);
        return repo.findAll(pageRequest);
    }

    public Categoria fromDTO(CategoriaDTO objDto){
        return new Categoria(objDto.getId(),objDto.getName());
    }
}
