/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Lista {
    private ArrayList lista;

    public Lista() {
        this.lista = new ArrayList();
    }
    
    
    public void addPessoa(Pessoa pessoa){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(pessoa.getNomeCompleto()) ) {
                System.out.println("\nErro: Pessoa ja cadastrada!!\n");
                return;
            }
        }
        lista.add(pessoa.getNomeCompleto());
    }
    
    public void imprimeLista(){
        System.out.println("\n\nLista de participantes:\n");
        this.lista.forEach(nome -> System.out.println("Nome: "+nome));
    } 
    
}
