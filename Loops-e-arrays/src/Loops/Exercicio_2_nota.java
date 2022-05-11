package Loops;

import java.util.Scanner;

public class Exercicio_2_nota {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Digite a nota: ");
            nota = leitura.nextInt();
        } while (nota < 0 | nota > 10);

    }
}
