package org.example;

public class Exercicio3f {
    private static final String[] unidades = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    private static final String[] especiaisDezA19 = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
    private static final String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    private static final String[] centenas = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
    public static String converterParaNome(int numero) {
        if (numero == 0) {
            return "zero";
        }
        String nome = "";
        String parte;
        if (numero >= 100) {
            parte = centenas[numero / 100];
            nome += parte;
            numero %= 100;
            if (numero != 0) {
                nome += " e ";
            }
        }
        if (numero >= 10 && numero <= 19) {
            nome += especiaisDezA19[numero - 10];
            numero = 0;
        } else if (numero >= 20) {
            parte = dezenas[numero / 10];
            nome += parte;
            numero %= 10;
            if (numero != 0) {
                nome += " e ";
            }
        }
        if (numero >= 1 && numero <= 9) {
            parte = unidades[numero];
            nome += parte;
        }
        return nome;
    }
    public static void main(String[] args) {
        System.out.println("A sequência dos 8 primeiros números que começam com a letra 'D' são:");
        int contador = 0;
        int numero = 0;
        do {
            String numeroString = converterParaNome(numero);
            if (numeroString.charAt(0) == 'd') {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador < 8);
    }
}