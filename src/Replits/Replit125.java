package Replits;

public class Replit125 {

    static int number=200;

    static void accessNumber(){
        System.out.println(number);
    }

    public static void main(String[] args) {
        number=200;
        Replit125.accessNumber();

        Replit125 r125=new Replit125();
        r125.accessNumber();
    }
}