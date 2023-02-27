package Replits;

public class Replit138 {

    private static void printPrivate(){
        System.out.println("private");
    }
    static void printDefault(){
        System.out.println("default");
    }
    protected static void printProtected(){
        System.out.println("protected");
    }
    public static void printPublic(){
        System.out.println("public");
    }

    public static void main(String[] args) {

        Replit138.printDefault();
        Replit138.printProtected();
        Replit138.printPublic();

    }
}
