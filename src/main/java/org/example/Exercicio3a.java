package org.example;

public class Exercicio3a {
    public static void main(String[] args) {
        int numeroInicialdaSequencia = 1;
        int numeroFinaldaSequencia = 7;
        int proximoNumerodaSequencia = numeroFinaldaSequencia + 2;
        for (int numero = numeroInicialdaSequencia; numero <= numeroFinaldaSequencia; numero += 2) {
            System.out.print(numero + " ");
        }
        System.out.println(proximoNumerodaSequencia);
        System.out.println("O valor que estava faltando na sequência é o numero: " + proximoNumerodaSequencia);
    }

}