package br.com.dio.collection.Desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testes1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        Set<Integer> setFig = new HashSet<>();

        for (int i = 1; i <= numFigCompradas; i++) {
            int numParcial = scan.nextInt();
        setFig.add(numParcial);
        }
        System.out.println(numTotal - setFig.size());
    }
}

/* N (1 ≤ N ≤ 100) indicando o número total de figurinhas
   M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas
   M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma figurinha já comprada. */
