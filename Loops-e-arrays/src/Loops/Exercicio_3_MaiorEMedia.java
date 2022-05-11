package Loops;

import java.util.Scanner;

public class Exercicio_3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero;
        int somaNumero = 0;
        int mediaNumero;
        int maiorNumero = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Informe o numero " + i + ": ");
            numero = leitura.nextInt();
            somaNumero += numero;
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }
        mediaNumero = somaNumero / 5;

        System.out.println("O maior numero é: " + maiorNumero);
        System.out.println("A media dos numeros é: " + mediaNumero);
    }
}
