package Replits;

import java.util.Scanner;

public class Replit77 {
    public static void main(String[] args) {

     int[]numbers=new int[5];
        Scanner scan=new Scanner(System.in);
        numbers[0]=scan.nextInt();
        numbers[1]=scan.nextInt();
        numbers[2]=scan.nextInt();
        numbers[3]=scan.nextInt();
        numbers[4]=scan.nextInt();

        for (int i= numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
