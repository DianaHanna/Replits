package Replits;

public class Replit132 {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
    }

    public static void reduce10(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] - 10;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

