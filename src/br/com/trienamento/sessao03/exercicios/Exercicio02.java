package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Fça um programa que leia um número real e o imprima
 */
public class Exercicio02 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe um valor (numérico): ");

        // Recuperando o valor do teclado
        float valor = sc.nextFloat();

        // Imprimindo o valor no console
        System.out.println("O valor informado foi: " + valor + ".");
    }
}
