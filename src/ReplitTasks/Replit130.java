package ReplitTasks;

public class Replit130 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
                System.out.print(a[i]+" ");
            } else {
                a[i] = a[i] * 10;
                System.out.print(a[i]+" ");
            }
        }
    }
}