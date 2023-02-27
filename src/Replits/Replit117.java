package Replits;

public class Replit117 {

    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
       int x=8;
       int sum=sumEvenToX(x);
        System.out.println(sum);
    }
    }


