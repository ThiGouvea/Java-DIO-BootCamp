package one.digitalinovation.basecamp;

public class Casting {
    public static void main(String[] args) {
        long numero1 = 144L;
        int numero2;
        numero2 = (int) numero1;

        float numeroQuebrado = 45.6F;
        double numeroQuebrado2 = numeroQuebrado;

        float paraInteiro = 34.9F;
        int inteiro = (int) paraInteiro;



        int i = 3;

        int resultado = 10-5*2 + --i;
        System.out.println(resultado);
    }
}
