package org.example;

public class Exercicio3d {
    public static void main(String[] args) {
            int numeroInicial = 2;
            int numeroFinal = 8;
            int proximoNumero = (numeroFinal + 2) * (numeroFinal + 2);
            for (int numero = numeroInicial; numero * numero <= proximoNumero; numero += 2) {
                int elemento = numero * numero;
                System.out.print(elemento + " ");
            }
        System.out.println("\nO valor que estava faltando na sequência é o numero: " + proximoNumero);
        }
    }
