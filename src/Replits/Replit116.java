package Replits;

public class Replit116 {
     public static boolean even(int num1, int num2){
        boolean bothEven=true;
        if (num1%2==0 && num2%2==0){
           return bothEven;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(even(6,3));
    }
}
