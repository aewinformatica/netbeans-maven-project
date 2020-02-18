/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.repository;

import com.mycompany.mavenproject2.model.Lancamento;
import javax.persistence.EntityManager;

/**
 *
 * @author Jessica
 */
public class Lancamentos {
    
    private EntityManager manager;

    public Lancamentos(EntityManager manager) {
        this.manager = manager;
    }
    
    public void adicionar(Lancamento lancamento){
        this.manager.merge(lancamento);
    }
}
