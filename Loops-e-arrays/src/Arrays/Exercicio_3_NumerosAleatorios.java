package Arrays;

import java.util.Random;

public class Exercicio_3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();


        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1)+ " ");
        }
    }
}
