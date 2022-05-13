package br.com.dio.collection.set;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7D, 8.5, 9.3, 5D, 7D, 0D, 3.6));

        //System.out.println("Exiba a posição da nota 5.0: "); "não eh possivel, pois são adicionados random

        //System.out.println("Adicione na lista a nota 8 na posição 4: "); "tambem n é possivel hashset n tem posicoes definidas
        //System.out.println("Substitua a nota 5 pela nota 6: "); não eh possivel substituir
        System.out.println("Confira se a nota 5 esta no conjunto " + notas.contains(5D));

        //System.out.println("Exiba a terceira nota adicionada: "); não é possivel pois n tem o metodo Get
        System.out.println("Exiba a menor nota? " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores" );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0D;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0D);

        //System.out.println("Remova a nota da posicao 0: "); não eh possivel pois em hash n existem posições definidas
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }

        //System.out.println("Exiba todas as notas na ordem que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7D);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5D);
        notas2.add(7D);
        notas2.add(0D);
        notas2.add(3.6);
        System.out.println(notas2);


        System.out.println("Exiba todas as notas em ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto esta vazio" + notas.isEmpty());
        System.out.println("Confira se o conjunto esta vazio" + notas2.isEmpty());
    }
}
