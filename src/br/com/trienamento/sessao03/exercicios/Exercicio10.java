package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia uma velocidade em km/h (quilômetros por hora) e apresente-a convertida em m/s (metros por segundo).
 * Fórmula:
 * <p>
 * kmh = quilômetros por hora
 * ms = metros por segundo
 * <p>
 * ms = kmh/3.6
 */
public class Exercicio10 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o valor da velocidade (KM/H): ");

        // Recuperando o valor do teclado
        var velocidadeKMH = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var velocidadeMS = (velocidadeKMH / 3.6f);

        // Imprimindo o valor no console
        System.out.println("Velocidade em KM/H " + velocidadeKMH + ".");
        System.out.println("Velocidade em M/S " + velocidadeMS + ".");
    }
}
