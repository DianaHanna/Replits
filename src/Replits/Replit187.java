package Replits;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        words.remove(0);
        words.remove(2);
        words.remove(4);

        for (String word:words) {
            System.out.print(word+" ");
        }
    }
}
