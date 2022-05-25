package br.com.dio.collection.Desafios;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int count = 0;
        for (int i = 0; i <= (respostasCompetidoresSplit.length - 1); i++) {
            if (Integer.parseInt(respostasCompetidoresSplit[i]) == Integer.parseInt(T))
                count++;
        }

        System.out.println(count);
    }
}
