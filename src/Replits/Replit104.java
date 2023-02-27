package Replits;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Please enter 5 names");

        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (names.length > 3) {
                    System.out.println(names[i].substring(0, 3));
        }else {
                System.out.println("error");
            }
            }
        }
    }
