package Arrays;

import java.util.Random;

public class Exercicio_4_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[4][4];

        for (int i = 0; i <= 3; i++) {
            for (int b = 0; b <= 3; b++) {
                matrix[i][b] = random.nextInt(9);
            }
        }
        System.out.println( matrix[0][0] + "-" + matrix[0][1] + "-" + matrix[0][2] + "-" + matrix[0][3] +
                     "\n" + matrix[1][0] + "-" + matrix[1][1] + "-" + matrix[1][2] + "-" + matrix[1][3] +
                     "\n" + matrix[2][0] + "-" + matrix[2][1] + "-" + matrix[2][2] + "-" + matrix[2][3] +
                     "\n" + matrix[3][0] + "-" + matrix[3][1] + "-" + matrix[3][2] + "-" + matrix[3][3]);
    }
}
