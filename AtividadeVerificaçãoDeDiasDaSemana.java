package Atividade05;

import java.util.Scanner;

public class AtividadeVerificaçãoDeDiasDaSemana {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int dia = 0;


        System.out.println("Informe o dia da semana: ");
        dia = sc.nextInt();

        if (dia >= 1 && dia <= 7) {
            switch (dia) {
                case 1 -> System.out.println("Segunda");
                case 2 -> System.out.println("Terça");
                case 3 -> System.out.println("Quarta");
                case 4 -> System.out.println("Quinta");
                case 5 -> System.out.println("Sexta");
                case 6 -> System.out.println("Sábado");
                case 7 -> System.out.println("Domingo");
            }
        } else {
            System.err.println("Dia inválido");
        }
    }
}