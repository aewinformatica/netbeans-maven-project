/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.repository;

import com.mycompany.mavenproject2.model.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Jessica
 */
public class Pessoas {
    
    private EntityManager manager;

    public Pessoas(EntityManager manager) {
        
        this.manager = manager;
    }
    
    public Pessoa porId(Long id){
        
       return manager.find(Pessoa.class, id);
    }
    
    public List<Pessoa>listarPessoas(){
    
        TypedQuery<Pessoa> query = manager.createQuery("from pessoa", Pessoa.class);
//                    retornando uma lista de pessoas
                    return query.getResultList();
    }
    
}
