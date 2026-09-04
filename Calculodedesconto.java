package Atividade10;

import java.util.Scanner;


public class Calculodedesconto {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double valorcompra = 0;
        double percentualdesconto = 0;
        double valordesconto = 0;
        double valorfinal = 0;


        System.out.println("Qual é o valor total da compra?");
        valorcompra = sc.nextDouble();


        if (valorcompra > 500) {
            percentualdesconto = 20;
        } else if (valorcompra >= 200) {
            percentualdesconto = 10;
        } else if (valorcompra >= 100) {
            percentualdesconto = 5;
        } else {
            percentualdesconto = 0;
        }
        valordesconto = valorcompra * percentualdesconto / 100;

        valorfinal = valorcompra - valordesconto;

        System.out.println("Valor original: R$ " + valorcompra);
        System.out.println("Percentual de desconto: " + percentualdesconto + "%");
        System.out.println("Valor descontado: R$ " + valordesconto);
        System.out.println("Valor final: R$ " + valorfinal);

    }
    }

