/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_controle_de_frequencia_da_secomp.control;

import com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model.Lista;
import com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Controller {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        String nome = " ";
        
        
        while(true){
            System.out.println("\nInforme o nome do participante:");
            nome = scanner.nextLine();
            if(nome.equals("imprimir")) {
                lista.imprimeLista();   
                return;
            }
            lista.addPessoa(new Pessoa(nome));
        }
       
    }
    
}
