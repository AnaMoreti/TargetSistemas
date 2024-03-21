package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();
        String invertida = inverterString(entrada);
        System.out.println("A palavra invertida fica: " + invertida);
        scanner.close();
    }
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        for (int letra = 0; letra < tamanho / 2; letra++) {
            char temp = caracteres[letra];
            caracteres[letra] = caracteres[tamanho - 1 - letra];
            caracteres[tamanho - 1 - letra] = temp;
        }
        return new String(caracteres);
    }
}