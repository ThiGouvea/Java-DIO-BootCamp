package br.com.dio.collection.list;

import javax.xml.transform.stream.StreamSource;
import java.util.*;

class ExemploList {
    public static void main(String[] args) {
        //List notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7D);
        notas.add(8.5D);
        notas.add(9.3D);
        notas.add(5D);
        notas.add(7D);
        notas.add(0D);
        notas.add(3.6D);

        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5D));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8D);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5D), 6D);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: ");
        System.out.println(notas.contains(5D));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0D;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));

        // System.out.println("Remova a nota 0: " );
        notas.remove(0D);
        System.out.println("Remova a nota 0: " + notas);

        //System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println("Remova a nota na posição 0: " + notas);

        //System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7D) {
                iterator1.remove();
            }
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " + notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
    }
}
