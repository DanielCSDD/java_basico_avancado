package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia uma temperatura em graus Kelvin e apresente-a em graus Celsius.
 * Fórmula:
 * <p>
 * K = Kelvin
 * C = Celsius
 * <p>
 * C = K - 273.15
 */
public class Exercicio08 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o valor da temperatura (grau Kelvin): ");

        // Recuperando o valor do teclado
        var temperaturaK = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var temperaturaC = temperaturaK - 273.15;

        // Imprimindo o valor no console
        System.out.println("Temperatura em Grau Kelvin " + temperaturaK + ".");
        System.out.println("Temperatura em Grau Celsius " + temperaturaC + ".");
    }
}
