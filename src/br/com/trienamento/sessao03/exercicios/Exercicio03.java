package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Faça um programa onde o usuário irá informar 3 valores.
 * No final imprima a soma dos mesmos.
 */
public class Exercicio03 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o primeiro valor (usar vírgula): ");

        // Recuperando o valor do teclado
        // No java 17 pode-se utilizar a vírgula ao informar o valor.
        var valor01 = sc.nextFloat();

        // Mensagem que aparecerá no console
        System.out.print("Informe o segundo valor (usar vírgula): ");

        // Recuperando o valor do teclado
        var valor02 = sc.nextFloat();

        // Mensagem que aparecerá no console
        System.out.print("Informe o terceiro valor (usar vírgula): ");

        // Recuperando o valor do teclado
        var valor03 = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var soma = (valor01 + valor02 + valor03);

        // Imprimindo o valor no console
        System.out.println("A soma dos valores são: " + soma + ".");
    }
}
