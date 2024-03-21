package org.example;

public class Exercicio3e {
    public static void main(String[] args) {
        int primeiroNumero = 1;
        int segundoNumero = 1;
        int proximoNumero;
        System.out.print(primeiroNumero + " " + segundoNumero + " ");
        for (int numero = 0; numero < 5; numero++) {
            proximoNumero = primeiroNumero + segundoNumero;
            System.out.print(proximoNumero + " ");
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
        System.out.println("\nO valor que estava faltando na sequência é o numero: 13" );
    }
    }

