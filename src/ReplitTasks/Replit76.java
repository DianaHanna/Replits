package ReplitTasks;

import java.util.Scanner;

public class Replit76 {
    public static void main(String[] args) {

     String[]days=new String[7];
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter day 1 of the week");
     days[0]=scan.nextLine();
        System.out.println("Please enter day 2 of the week");
        days[1]=scan.nextLine();
        System.out.println("Please enter day 3 of the week");
        days[2]=scan.nextLine();
        System.out.println("Please enter day 4 of the week");
        days[3]=scan.nextLine();
        System.out.println("Please enter day 5 of the week");
        days[4]=scan.nextLine();
        System.out.println("Please enter day 6 of the week");
        days[5]=scan.nextLine();
        System.out.println("Please enter day 7 of the week");
        days[6]=scan.nextLine();

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
