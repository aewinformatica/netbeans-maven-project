/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.service;

import com.mycompany.mavenproject2.exception.NegocioException;
import com.mycompany.mavenproject2.model.Lancamento;
import com.mycompany.mavenproject2.repository.Lancamentos;
import java.util.Date;

/**
 *
 * @author Jessica
 */
public class CadastrarLancamentos {
    
    private Lancamentos lancamentos;

    public CadastrarLancamentos(Lancamentos lancamentos) {
        this.lancamentos = lancamentos;
    }
    
    public void salvar(Lancamento lancamento)throws NegocioException{
    
        if(lancamento.getDataPagamento() != null &&
           lancamento.getDataPagamento().after(new Date())){
            throw new NegocioException("Data de Pagamento não pode ser uma data Futura.");
        }
        
        this.lancamentos.adicionar(lancamento);
    }
}
