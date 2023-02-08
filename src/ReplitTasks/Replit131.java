package ReplitTasks;

public class Replit131 {
    public static String thirdLetter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 3) {
            result += s.charAt(i);
        }
        return result;
    }



    public static void main(String[] args) {
        String input="hello there";
        System.out.println(thirdLetter(input));
    }
    }
