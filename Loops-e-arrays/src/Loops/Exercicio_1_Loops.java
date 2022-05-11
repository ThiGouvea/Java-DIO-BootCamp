package Loops;

import java.util.Scanner;

public class Exercicio_1_Loops {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "";
        int idade;


        while(true) {
            System.out.println("Digite o nome: ");
            nome = leitura.next();
            if (nome.equals("0")) break;

            System.out.println("Digite a idade: ");
            idade = leitura.nextInt();
        }
    }
}
