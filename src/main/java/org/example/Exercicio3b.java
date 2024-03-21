package org.example;

public class Exercicio3b {
    public static void main(String[] args) {
        int numeroInicialdaSequencia = 2;
        int numeroFinaldaSequencia = 64;
        int proximoNumero = numeroFinaldaSequencia * 2;
        for (int numeroAtual = numeroInicialdaSequencia; numeroAtual <= numeroFinaldaSequencia; numeroAtual *= 2) {
            System.out.print(numeroAtual + " ");
        }
        System.out.println(proximoNumero);
        System.out.println("O valor que estava faltando na sequência é o numero: " + proximoNumero);
    }
}
