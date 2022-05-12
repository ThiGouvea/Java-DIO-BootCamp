package br.com.dio.collection.list;

import java.util.*;

public class Exercicio2_Assassino {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();
        String resposta;
        int contadorAfirmativas = 0;

        System.out.println("Telefonou para a vitima?");
        resposta = leitura.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no loca do crime?");
        resposta = leitura.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vitima?");
        resposta = leitura.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vitima?");
        resposta = leitura.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Ja trabalhou com a vitima?");
        resposta = leitura.next();
        respostas.add(resposta.toLowerCase());

        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String simNao = contador.next();
            if (simNao.contains("s")) contadorAfirmativas++;
        }

        switch (contadorAfirmativas) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
            default:
                System.out.println("Inocente");
        }
    }
}
