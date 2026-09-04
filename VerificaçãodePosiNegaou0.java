package Atividade09;

import java.util.Scanner;


public class VerificaçãodePosiNegaou0 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double numero = 0;

        System.out.println("Digite um número");
        numero = sc.nextDouble();
        if (numero < 0) {
            System.out.println("Seu número é negativo");
        } else if (numero > 0) {
            System.out.println("Seu número é positivo");
        } else
            System.out.println("Seu número é zero");

    }

}
