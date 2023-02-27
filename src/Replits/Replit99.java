package Replits;

import java.util.Scanner;

public class Replit99 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        boolean isPalindrome = true;
        StringBuilder stringBuilder = new StringBuilder(givenString);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();
        if (givenString.trim().equalsIgnoreCase(reversedStr)){
            System.out.println(isPalindrome);
        } else {
            isPalindrome=false;
            System.out.println(isPalindrome);

        }
    }
}
