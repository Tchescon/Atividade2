package Atividade04;

import java.util.Scanner;

public class AtividadeVerificaçãodeLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String NOMECORRETO = "Francesco";
        final String SENHACORRETA = "1234abcd";

        String nome = "";
        String senha = "";

        System.out.println("Insira o seu nome de usuário: ");
        nome = sc.nextLine();
        System.out.println("Insira a sua senha: ");
        senha = sc.nextLine();

        if (nome.equals(NOMECORRETO) && SENHACORRETA.equals(senha)) {
            System.out.println("Sucesso!! ");
        }else {
            System.out.println("Erro!! ");


        }

    }

    }