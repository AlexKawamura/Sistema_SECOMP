/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_de_controle_de_frequencia_da_secomp.control;

// A classe Lista não é mais utilizada
//import com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model.Lista;
import com.mycompany.sistema_de_controle_de_frequencia_da_secomp.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Controller {
    
    private static ArrayList<Pessoa> listaAlunos = new ArrayList();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String op = null;
        
        do {
            
            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            op = scanner.nextLine();
            
            switch(op) {
                case "1":
                    addPessoa();
                    break;
                case "2":
                    imprimeLista();
                    break;
            }
        }while(!op.equals("0"));
        
//        FALTOU MENU COM FUNCIONALIDADES
//        
//        Scanner scanner = new Scanner(System.in);
//        Lista lista = new Lista();
//        String nome = " ";
//        
//        
//        while(true){
//            System.out.println("\nInforme o nome do participante:");
//            nome = scanner.nextLine();
//            if(nome.equals("imprimir")) {
//                lista.imprimeLista();   
//                return;
//            }
//            lista.addPessoa(new Pessoa(nome));
//        }
    }
    
//  DIVISÃO DO CÓDIGO EM MÉTODOS
    public static void addPessoa(){
        System.out.println("\nInforme o nome do participante:");
        String nome = scanner.nextLine();
//        Modularização do código
//        for (int i = 0; i < listaAlunos.size(); i++) {
//            if (listaAlunos.get(i).equals(nome) ) {
//                System.out.println("\nErro: Pessoa ja cadastrada!!\n");
//                return;
//            }
//        }
        if (verificaNome(nome)){
            listaAlunos.add(new Pessoa(nome));   
        }
    }
    
    public static boolean verificaNome(String nome){
        for (Pessoa aluno : listaAlunos){
            if(aluno.getNomeCompleto().equals(nome)){
                System.out.println("Nome já cadastrado!");
                return false;
            }
        }
        return true;
    }
    
    public static void imprimeLista(){
        System.out.println("\n\nLista de participantes:\n");
        for (Pessoa aluno : listaAlunos){
            System.out.println(aluno.getNomeCompleto());
        }
    } 
    
}
