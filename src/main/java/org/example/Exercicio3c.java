package org.example;

public class Exercicio3c {
    public static void main(String[] args) {
        int numeroInicial = 0;
        int numeroFinal = 36;
        int proximoNumero = (int) Math.pow(Math.sqrt(numeroFinal) + 1, 2);
        for (int numero = numeroInicial; numero * numero <= proximoNumero; numero++) {
            int elemento = numero * numero;
            System.out.print(elemento + " ");
        }
        System.out.println("\nO valor que estava faltando na sequência é o numero: " + proximoNumero);
    }
}
