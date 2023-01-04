package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia uma temperatura em graus fahrenheit e apresente-a em graus Celsius.
 * Fórmula:
 *
 * F = Fahrenheit
 * C = Celsius
 *
 * C = 5.0 * (F - 32.0) / 9.0
 */
public class Exercicio07 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o valor da temperatura (grau Fahrenheit): ");

        // Recuperando o valor do teclado
        var temperaturaF = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var temperaturaC = 5.0 * (temperaturaF - 32.0) / 9.0;

        // Imprimindo o valor no console
        System.out.println("Temperatura em Grau Fahrenheit " + temperaturaF + ".");
        System.out.println("Temperatura em Grau Celsius " + temperaturaC + ".");
    }
}
