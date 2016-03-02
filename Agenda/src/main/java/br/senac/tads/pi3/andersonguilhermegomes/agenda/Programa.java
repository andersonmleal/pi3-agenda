/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.andersonguilhermegomes.agenda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("1 - Inserir Contato. \n2 - Editar Contato. \n3 - Remover Contato. \n4 - Listar Contato. \n0 - Encerrar");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    try {
                        // insere dados agenda
                        System.out.print("Digite o codigo da pessoa: ");
                        int id = teclado.nextInt();
                        System.out.print("nome: ");
                        String nome = teclado.next();
                        System.out.print("Nascimeto(DD/MM/AAAA): ");
                        String nascimento = teclado.next();
                        System.out.print("telefone: ");
                        String telefone = teclado.next();
                        System.out.print("email: ");
                        String email = teclado.next();

                        // cria objeto agenda
                        Agenda a = new Agenda(nome, nascimento, telefone, email);

                        // conexao com bd
                        a.alterarPessoa(a, id);

                        System.out.println("-- DADOS ALTERADOS --");
                    } catch (Exception e) {

                        System.out.println("----- DADOS INVALIDOS -----");
                        System.out.println("ERRO:" + e);
                    }

                    break;
                case 2:
                    try {
                        // insere dados agenda
                        System.out.print("Digite o codigo da pessoa: ");
                        int id = teclado.nextInt();
                        System.out.print("nome: ");
                        String nome = teclado.next();
                        System.out.print("Nascimeto(DD/MM/AAAA): ");
                        String nascimento = teclado.next();
                        System.out.print("telefone: ");
                        String telefone = teclado.next();
                        System.out.print("email: ");
                        String email = teclado.next();

                        // cria objeto agenda
                        Agenda a = new Agenda(nome, nascimento, telefone, email);

                        // conexao com bd
                        a.alterarPessoa(a, id);

                        System.out.println("-- DADOS ALTERADOS --");
                    } catch (Exception e) {

                        System.out.println("----- DADOS INVALIDOS -----");
                        System.out.println("ERRO:" + e);
                    }

                    break;
                case 3:
                    System.out.print("Digite o codigo do contato: ");
                    int id = teclado.nextInt();

                    // conexao com bd
                    Agenda a = new Agenda();
                    // a.deletaContato(id);

                    break;
                case 4:

                    Agenda ab = new Agenda();
                    ab.listarPessoas();

                    break;

            }

        }
    }

}
