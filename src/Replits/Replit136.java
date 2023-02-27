package Replits;

public class Replit136 {

    private static void privateMethod(){
        System.out.println("This is Private Method");
    }
    static void defaultMethod(){
        System.out.println("This is Default Method");
    }
   static void protectedMethod(){
       System.out.println("This is Protected Method");
    }
    public static void publicMethod(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();

    }

}
