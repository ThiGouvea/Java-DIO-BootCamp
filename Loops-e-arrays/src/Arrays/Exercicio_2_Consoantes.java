package Arrays;

import java.util.Scanner;

public class Exercicio_2_Consoantes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String[] vetor = new String[6];
        String[] consoantes = new String[6];
        String letra = "";
        int quantidadeConsoantes = 0;

        for(int i = 0; i <= 5; i++) {
            System.out.print("Digite a consoante da posição " + (i + 1) + " do vetor: ");
            vetor[i] = leitura.next();
            letra = vetor[i];
            if(!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                quantidadeConsoantes++;
                consoantes[quantidadeConsoantes - 1] = vetor[i];
            }
        }
        System.out.println("A quantidade de consoantes e: " + quantidadeConsoantes);
        if(quantidadeConsoantes > 0) {
            System.out.println("As consoantes são: ");
            for (int i = 0; i < quantidadeConsoantes; i++){
                System.out.print(consoantes[i] + " ");
            }
        }
    }
}
