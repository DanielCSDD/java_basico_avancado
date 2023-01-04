package br.com.trienamento.sessao03.exercicios;

import java.util.Scanner;

/**
 * Leia um número real e imprima a quinta parte.
 */
public class Exercicio05 {

    public static void main(String[] args) {

        // A partir do Java 10 podese utilizar variáveis de tipo: var.
        // Porém, são limitadas a serem utilizadas apenas em métodos.

        // Classe que irá recuperar o valor do teclado.
        var sc = new Scanner(System.in);

        // Mensagem que aparecerá no console
        System.out.print("Informe o valor (usar vírgula): ");

        // Recuperando o valor do teclado
        var valor01 = sc.nextFloat();

        // Código que efetuará o cálculo matemático
        var resultado = (valor01/5);

        // Imprimindo o valor no console
        System.out.println("O valor referente à quinta parte do número é: "+ resultado + ".");
    }
}
