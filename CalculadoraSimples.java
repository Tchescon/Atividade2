package Atividade07;

import java.util.Scanner;

public class CalculadoraSimples {

    static void main() {
    Scanner sc = new Scanner(System.in);

    double primeironumero = 0;
    double segundonumero = 0;
    String expressao = "";

        System.out.println("Digite o primeiro número: ");
        primeironumero = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        segundonumero= sc.nextDouble();
        System.out.println("Digite a expressão(+, -, * ou /): ");
        expressao = sc.next();

        double resultado = 0;

           switch (expressao) {
               case "+" : resultado =primeironumero + segundonumero;

                   System.out.println("Resultado: " + resultado);
                   break;

               case "-" : resultado =primeironumero - segundonumero;

                   System.out.println("Resultado: " + resultado);
                    break;

               case "*" : resultado =primeironumero * segundonumero;

                   System.out.println("Resultado: " + resultado);
                   break;

               case "/" :
                   if (segundonumero !=0) {
                       resultado = primeironumero / segundonumero;
                       System.out.println("Resultado:" + resultado);
                   } else {
                       System.out.println("Erro: não é possível dividir por zero");
                   }
                   break;
               default:
                   System.out.println("Operação Inválida: ");



           }
        }

    }
