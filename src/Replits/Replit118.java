package Replits;

public class Replit118 {

    public static String spaceOut(String s){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            stringBuilder.append(s.charAt(i)).append(" ");

        }
        return stringBuilder+" ".toString().trim()+" ";
    }

    public static void main(String[] args) {
        System.out.println(spaceOut("hello"));
    }
}
