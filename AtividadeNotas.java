package Atividade02;

import java.util.Scanner;

public class AtividadeNotas {
    public static void main(String[] args) {

        double nota = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10) {
        }else{
            System.err.println("Nota inválida");
        }

        // o "&&" é um operador relacional que significa "e"]

        if(nota>= 9){
            System.out.println("Nota Excelente");
        }else if(nota>= 7) {
            System.out.println("Nota Boa");
        }else if(nota>= 5) {
            System.out.println("Satisfatória");
        }else {
            System.out.println("Nota Ruim");
        }
        }
    }
