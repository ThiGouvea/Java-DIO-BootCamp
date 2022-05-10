package one.digitalinovation.basecamp;

public class Quadrilatero {
    public static void area(double lado) {
        double area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }

    public static void area(double lado1, double lado2) {
        double area1 = lado1 * lado2;
        System.out.println("A area do retangulo é: " + area1);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        double area3 = (baseMaior + baseMenor) * altura;
        System.out.println("A area do trapezio é: " + area3);
    }
}
