package Loops;

import java.util.Scanner;

public class Exercicio_4_ParEImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroQuantidade;
        int numero;
        int numerosImpares = 0;
        int numerosPares = 0;

        System.out.println("Quantos numeros inteiros deseja que sejam inseridos? ");
        numeroQuantidade = leitura.nextInt();

        for (int i = 1; i <= numeroQuantidade; i++){
            System.out.println("Insira o numero " + i + " a ser avaliado");
            numero = leitura.nextInt();
            if ((numero % 2) == 0) {
                numerosPares += 1;
            } else {
                numerosImpares += 1;
            }
        }
        System.out.println("Quantidade de numeros pares: " + numerosPares);
        System.out.println("Quantidade de numeros impares: " + numerosImpares);
    }
}
