package one.digitalinovation.basecamp;

public class Mensagem {
    public static void retornarMensagem(int hora) {
        if (hora > 6 && hora < 12) {
            System.out.println("Bom Dia!!");
        }

        if (hora > 12 && hora < 19) {
            System.out.println("Boa Tarde!!");
        }

        if (hora < 6 | hora >19) {
            System.out.println("Boa Noite!!");
        }
    }
}
