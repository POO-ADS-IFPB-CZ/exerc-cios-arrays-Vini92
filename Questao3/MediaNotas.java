/*
Crie um programa que armazene um vetor com as notas de dez alunos,
calcule e imprima a média dessas notas e depois informe a quantidade
de notas acima e abaixo da média calculada.
 */

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10; // Número de alunos
        double[] notas = new double[numAlunos]; // Vetor para armazenar as notas
        double soma = 0;

        // Pedindo ao usuário para inserir as notas dos alunos
        System.out.println("Insira as notas dos " + numAlunos + " alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calculando a média das notas
        double media = soma / numAlunos;
        System.out.println("A média das notas é: " + media);

        // Contando quantas notas estão acima e abaixo da média
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (int i = 0; i < numAlunos; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            }
        }

        // Imprimindo a quantidade de notas acima e abaixo da média
        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoDaMedia);

        scanner.close();
    }
}