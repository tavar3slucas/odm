package com.lucastavares.odm.controller.dto;

import com.lucastavares.odm.domain.Categoria;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CategoriaDTO implements Serializable {

    public static final long serialVersionUID = 1L;
    private Integer id;
    @NotEmpty(message = "Preenchimento obrigatório")
    @Length(min = 5, max = 80 , message = "O tamanho deve ser entre 5 e 80 caracteres")
    private String name;

    public CategoriaDTO(){
    }

    public CategoriaDTO(Categoria obj){
        id = obj.getId();
        name = obj.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
