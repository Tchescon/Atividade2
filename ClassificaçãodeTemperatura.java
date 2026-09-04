package Atividade8;

import java.util.Scanner;


public class ClassificaçãodeTemperatura {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus celsius ? ");
        double graus = sc.nextInt();

        if (graus < 15) {
            System.out.println("Frio");
        } else if (graus >= 15 && graus <= 30) {
            System.out.println("Agradável");
        } else if (graus > 30 ) {
            System.out.println("Quente");
        }
        }


    }

