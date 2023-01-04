package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia uma temperatura em graus Celsius e apresente-a em graus Kelvin.
 * Fórmula:
 * <p>
 * K = Kelvin
 * C = Celsius
 * <p>
 * K = C + 273.15
 */
public class Exercicio09 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o valor da temperatura (grau Celsius): ");

        // Recuperando o valor do teclado
        var temperaturaC = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var temperaturaK = temperaturaC + 273.15;

        // Imprimindo o valor no console
        System.out.println("Temperatura em Grau Celsius " + temperaturaC + ".");
        System.out.println("Temperatura em Grau Kelvin " + temperaturaK + ".");
    }
}
