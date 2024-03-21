package org.example;

public class Exercicio4 {
    static boolean l1 = false;
    static boolean l2 = false;
    static boolean l3 = false;
    public static void main(String[] args) {
        ligarInterruptor(1); // Ligue o primeiro interruptor
        ligarInterruptor(2); // Ligue o segundo interruptor
        desligarInterruptor(1); // Desligue o primeiro interruptor
        if (l1) {
            System.out.println("O primeiro interruptor controla a lâmpada 1");
        } else if (l2) {
            System.out.println("O primeiro interruptor controla a lâmpada 2");
        } else {
            System.out.println("O primeiro interruptor controla a lâmpada 3");
        }
        if (l1 && l2 || !l1 && !l2) {
            System.out.println("O segundo interruptor controla a lâmpada 3");
        } else if (l1 && !l2) {
            System.out.println("O segundo interruptor controla a lâmpada 2");
        } else {
            System.out.println("O segundo interruptor controla a lâmpada 1");
        }
        if (l1 && l3 || !l1 && !l3) {
            System.out.println("O terceiro interruptor controla a lâmpada 2");
        } else if (l1 && !l3) {
            System.out.println("O terceiro interruptor controla a lâmpada 3");
        } else {
            System.out.println("O terceiro interruptor controla a lâmpada 1");
        }
    }
    public static void ligarInterruptor(int numeroInterruptor) {
        System.out.println("Ligando o interruptor " + numeroInterruptor);
        switch (numeroInterruptor) {
            case 1:
                l1 = !l1;
                break;
            case 2:
                l2 = !l2;
                break;
            case 3:
                l3 = !l3;
                break;
            default:
                break;
        }
    }
    public static void desligarInterruptor(int numeroInterruptor) {
        System.out.println("Desligando o interruptor " + numeroInterruptor);
    }
}