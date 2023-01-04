package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Fça um programa que leia um número inteiro e o imprima
 */
public class Exercicio01 {

    public static void main(String[] args){

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe um valor (numérico): ");

        // Recuperando o valor do teclado
        int valor = sc.nextInt();

        // Imprimindo o valor no console
        System.out.println("O valor informado foi: " + valor + ".");
    }
}
