package br.com.dio.collection.Desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testes2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int count = 0;
        for (int i = 0; i <= 4; i++) {
            if (respostasCompetidoresSplit[i].equals(T))
                count++;
        }
        System.out.println(count);
    }
}
