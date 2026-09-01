import java.util.Scanner;

/*
* Revisão do carro
*
* Se tiver menos de 10mil km não precisa de revisão
* Se tiver entre 10mil e 20milkm fazer revisão básica
* Se tiver entre 20mil e 30milkm fazer revisão plus
* Se tiver entre 30mil e 40milkm fazer revisão mega
* Se tiver maior de 40mil jogar fora
* */

public class EstruturaDeDecisaoSwitch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos km rodados ? ");
        int kmRodados = sc.nextInt();

        // V E V -> Verdade
        // V E F -> Falso

        // V OU V -> Verdade
        // V OU F -> Verdade

        /*
        * Operador Relacional
        * && = e
        * || = ou
        * */

        if (kmRodados < 10000) {
            System.out.println("Não precisa de revisão");
        } else if (kmRodados >= 10000 && kmRodados < 20000) {
            System.out.println("Revisão básica");
        } else if (kmRodados >= 20000 && kmRodados < 30000) {
            System.out.println("Revisão plus");
        } else if (kmRodados >= 30000 && kmRodados < 40000) {
            System.out.println("Revisão mega");
        } else {
            System.out.println("Joga Fora!");
        }



        //Pesquisem como mudar esse conjunto de if
        //para o switch colem aqui em baixo
         switch (kmRodados / 10000) {
            case 0 -> System.out.println("Não precisa de revisão");
            case 1 -> System.out.println("Revisão básica");
            case 2 -> System.out.println("Revisão plus");
            case 3 -> System.out.println("Revisão mega");
            default -> System.out.println("Joga Fora!");
        };
    }


}

