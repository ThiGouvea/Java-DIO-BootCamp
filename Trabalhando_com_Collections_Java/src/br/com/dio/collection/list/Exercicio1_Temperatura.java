package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1_Temperatura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        List<MesETemperatura> temperaturaPrimeiroSemestre = new ArrayList<>(){{
            add(new MesETemperatura("Janeiro", 0));
            add(new MesETemperatura("Fevereiro", 0));
            add(new MesETemperatura("Março", 0));
            add(new MesETemperatura("Abril", 0));
            add(new MesETemperatura("Maio", 0));
            add(new MesETemperatura("Junho", 0));
        }};

        System.out.println("Digite a temperatura dos 6 primeiros meses: ");
        System.out.println(temperaturaPrimeiroSemestre.indexOf(0));

        for (int i = 1; i <= 6; i++ ) {



        }
    }
}

class MesETemperatura {
    private String mes;
    private Integer temperatura;

    public MesETemperatura(String mes, Integer temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}