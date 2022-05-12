package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1_Temperatura2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<Double> temperaturasMensais = new ArrayList<Double>();
        List<Double> temperaturasAcimaMedia = new ArrayList<Double>();
        double temperatura;


        for (int i = 1; i <= 6; i++) {
            System.out.println("Insira a temperatura do mes " + i);
            temperatura = leitura.nextDouble();
            temperaturasMensais.add(temperatura);
        }

        Iterator<Double> iterator = temperaturasMensais.iterator();
        double somaTemperaturas = 0D;
        while (iterator.hasNext()) {
            double next = iterator.next();
            somaTemperaturas += next;
        }
        double mediaTemperaturas = somaTemperaturas / 6;

        Iterator<Double> iterator1 = temperaturasMensais.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next > mediaTemperaturas) temperaturasAcimaMedia.add(next);
        }



        System.out.println("A media das temperaturas é: " + mediaTemperaturas);
        System.out.println("As temperaturas acima da media: " + temperaturasAcimaMedia);
        System.out.println("Os meses com temperatura acima da media respectivamente são: ");

        Iterator<Double> iterator2 = temperaturasAcimaMedia.iterator();
        while (iterator2.hasNext()) {
            double next = iterator2.next();
            int indexAcimaMedia = temperaturasMensais.indexOf(next);
            switch (indexAcimaMedia) {
                    case (0):
                        System.out.println("1 - janeiro");
                        break;
                    case (1):
                        System.out.println("2 - fevereiro");
                        break;
                    case (2):
                        System.out.println("3 - março");
                        break;
                    case (3):
                        System.out.println("4 - abril");
                        break;
                    case (4):
                        System.out.println("5 - maio");
                        break;
                    case (5):
                        System.out.println("6 - junho");
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
            }
        }
    }
}
