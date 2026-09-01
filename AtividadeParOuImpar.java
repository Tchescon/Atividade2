package Atividade03;

import java.util.Scanner;

public class AtividadeParOuImpar {
    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe um número: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par ");
        }else {
            System.out.println("O número é ímpar");
        }

        //dois == é para comparar, como pedir
        //ao java "o que está dentro de numero é igual a 0?
        //o símbolo de porcentagem"%" significa resto da divisão
        //como ex.: 8 / 2 quantas vezes o 2 cabe no 8
        //ou 7 / 2 quantas vezes o 2 cabe no 7
        //considerando conjunto de números reais
        // 7 cabem 3 vezes e sobra resto 1
        // 8 cabem 4 vezes e sobra resto 0


    }
}