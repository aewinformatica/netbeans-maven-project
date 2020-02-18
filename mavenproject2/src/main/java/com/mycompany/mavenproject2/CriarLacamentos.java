/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import com.mycompany.mavenproject2.model.Lancamento;
import com.mycompany.mavenproject2.model.Pessoa;
import com.mycompany.mavenproject2.model.TipoLancamento;
import com.mycompany.mavenproject2.repository.Pessoas;
import com.mycompany.mavenproject2.util.JpaUtil;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.EntityManager;

/**
 *
 * @author Jessica
 */
public class CriarLacamentos {

    public static void main(String[] args) {
        EntityManager manager = JpaUtil.getEntityManager();
//        EntityTransaction trx = manager.getTransaction();
        
        Calendar dataVencimento1 = Calendar.getInstance();
        dataVencimento1.set(2020, 9, 1, 0, 0, 0);
        
        Pessoa cliente = new Pessoa();
        cliente.setNome("Wagner Gonçalves de Jesus");
        Pessoas pessoas = new Pessoas(manager);
                pessoas.salvar(cliente);
                
        Lancamento lancamento = new Lancamento();
        lancamento.setDescricao("Treinamento da Equipe");
        lancamento.setPessoa(cliente);
        lancamento.setDataVencimento(dataVencimento1.getTime());
        lancamento.setDataPagamento(dataVencimento1.getTime());
        lancamento.setValor(new BigDecimal(103_000));
        lancamento.setTipo(TipoLancamento.DESPESA);

//        trx.begin();
//        manager.persist(cliente);
        manager.persist(lancamento);
//        trx.commit();
//        manager.close();
    }

}
