package Atividade06;

import java.util.Scanner;

public class VerificaçãoDeAprovaçãoEscolar {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double mediafinal = 0;

        System.out.println("Informe a média final do aluno: ");
        mediafinal = sc.nextDouble();

        if (mediafinal >= 0 && mediafinal <= 10) {
        }else{
            System.err.println("Nota inválida");
        }

        // o "&&" é um operador relacional que significa "e"]

        if(mediafinal>= 7){
            System.out.println("Aprovado ");
        }else if(mediafinal>= 5 && mediafinal < 7) {
            System.out.println("Recuperação ");
        }else if(mediafinal < 5) {
            System.out.println("Reprovado ");
        }

    }
}