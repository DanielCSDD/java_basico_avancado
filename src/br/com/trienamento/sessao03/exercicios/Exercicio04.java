package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia um número real e imprima o resultado do quadrado desse número.
 */
public class Exercicio04 {

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

        // Código que efetuará o cálculo matemático
        var exponenciacao = Math.pow(valor01, 2);

        // Imprimindo o valor no console
        System.out.println("O valor do quadrado de " + valor01 + " é " + exponenciacao + ".");
    }
}
