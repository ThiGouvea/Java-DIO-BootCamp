package Arrays;

import java.util.Scanner;

public class Exercicio_1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
