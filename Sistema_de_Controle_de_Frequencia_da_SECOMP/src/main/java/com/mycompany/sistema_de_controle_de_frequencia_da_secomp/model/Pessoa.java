/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nomeCompleto;

    public Pessoa(String nome) {
        this.nomeCompleto = nome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
