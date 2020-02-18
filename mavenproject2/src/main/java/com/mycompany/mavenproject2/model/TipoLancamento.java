/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.model;

/**
 *
 * @author Jessica
 */
public enum TipoLancamento {
    
    RECEITA("Receita")
    ,DESPESA("Despesa");
    
    private String descricao;

    private TipoLancamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    
    
    
}
