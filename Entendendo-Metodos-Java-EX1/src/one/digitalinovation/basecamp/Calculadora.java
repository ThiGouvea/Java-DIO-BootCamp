package one.digitalinovation.basecamp;

public class Calculadora {
    public static void soma(double a, double b) {
        double somaNumeros = a + b;
        System.out.println("A soma dos numeros " + a + " e " + b + "é" + somaNumeros);
    }

    public static void subtracao(double a, double b) {
        double somaNumeros = a - b;
        System.out.println("A subtração dos numeros " + a + " e " + b + "é" + somaNumeros);
    }

    public static void multiplicacao(double a, double b) {
        double somaNumeros = a * b;
        System.out.println("A multiplicação dos numeros " + a + " e " + b + "é" + somaNumeros);
    }

    public static void divisao(double a, double b) {
        double somaNumeros = a / b;
        System.out.println("A divisão dos numeros " + a + " e " + b + "é" + somaNumeros);
    }

}
