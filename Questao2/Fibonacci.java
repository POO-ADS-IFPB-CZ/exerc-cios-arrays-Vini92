/*
Faça um programa que imprima os trinta primeiros elementos da série de Fibonacci.
A série é a seguinte: 1, 1, 2, 3, 5, 8,13 etc. Para calculá-la, o primeiro e segundo
elementos valem 1; daí por diante, cada elemento vale a soma dos dois elementos anteriores.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 30; // quantos elementos da série serão impressos

        // Definindo os dois primeiros elementos da série de Fibonacci
        int primeiro = 1;
        int segundo = 1;

        System.out.println("Os primeiros " + n + " elementos da série de Fibonacci são:");

        // Imprimindo os primeiros n elementos da série de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            // Calculando o próximo elemento da série
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}