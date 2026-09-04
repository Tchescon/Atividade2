package Atividade11;

import java.util.Scanner;

public class SistemadeCalculos {

    static void main() {
        Scanner sc = new Scanner(System.in);

        double salarioBruto = 0;
        int anosTrabalhados = 0;
        double bonusSalario = 0;
        double descontoSalario = 0;
        double salarioLiquido = 0;

        System.out.println("Qual é o salário Bruto do funcionário?");
        salarioBruto = sc.nextDouble();
        System.out.println("Quantos anos esse funcionário trabalha?");
        anosTrabalhados = sc.nextInt();

        if (anosTrabalhados > 10) {
            bonusSalario = 10;
        } else if (anosTrabalhados >= 5) {
            bonusSalario = 5;
        } else {
            bonusSalario = 0;
        }

        if (salarioBruto > 5000) {
            descontoSalario = 27;
        } else if (salarioBruto >= 3000) {
            descontoSalario = 18;
        } else {
            descontoSalario = 10;
        }

        bonusSalario = salarioBruto * bonusSalario / 100;
        descontoSalario = salarioBruto * descontoSalario / 100;

        salarioLiquido = salarioBruto + bonusSalario - descontoSalario;

        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Bônus recebido: " + bonusSalario);
        System.out.println("Imposto Descontado: " + descontoSalario);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}

