/*
Faça um programa que fique em laço solicitando a digitação de números
inteiros maiores ou iguais a zero. Quando o usuário digitar um número
menor que zero, o programa deve exibir a quantidade de números digitados
e a média desses números.
 */

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = 0;
        int soma = 0;
        double media = 0.0;

        System.out.println("Digite números inteiros maiores ou iguais a zero (digite um número negativo para parar):");

        // Laço para solicitar a digitação dos números
        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Verificando se o número é negativo
            if (numero < 0) {
                break;
            }

            // Incrementando a quantidade de números e somando o número digitado
            quantidadeNumeros++;
            soma += numero;
        }

        // Calculando a média dos números digitados
        if (quantidadeNumeros > 0) {
            media = (double) soma / quantidadeNumeros;
        }

        // Exibindo a quantidade de números digitados e a média
        System.out.println("Quantidade de números digitados: " + quantidadeNumeros);
        System.out.println("Média dos números digitados: " + media);

        scanner.close();
    }
}