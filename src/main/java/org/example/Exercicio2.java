package org.example;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        if (pertenceASequencia(numero)) {
            System.out.println("O numero " + numero + " pertence a sequência.");
        } else {
            System.out.println("O numero " + numero + " não pertence a sequência.");
        }
        scanner.close();
    }
    public static boolean pertenceASequencia(int numero) {
        int primeironumero = 0;
        int segundonumero = 1;
        if (numero == primeironumero || numero == segundonumero) {
            return true;
        }
        while (segundonumero <= numero) {
            int proximo = primeironumero + segundonumero;
            if (proximo == numero) {
                return true;
            }
            primeironumero = segundonumero;
            segundonumero = proximo;
        }
        return false;
    }
}