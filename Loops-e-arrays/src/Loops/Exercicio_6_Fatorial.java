package Loops;

import java.util.Scanner;

public class Exercicio_6_Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        int numeroFatorial;

        System.out.println("De qual numero deseja saber o fatorial? ");
        numero = leitura.nextInt();
        numeroFatorial = numero;
        System.out.println("O fatorial de " + numero + ":");

        do {
            numero--;
            numeroFatorial *= numero;

        } while (numero != 1);

        System.out.println(numeroFatorial);

    }
}
