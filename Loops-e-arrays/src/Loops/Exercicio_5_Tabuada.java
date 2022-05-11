package Loops;

import java.util.Scanner;

public class Exercicio_5_Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;

        System.out.println("De qual numero deseja saber a tabuada? ");
        numero = leitura.nextInt();
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
