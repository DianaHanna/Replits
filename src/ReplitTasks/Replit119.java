package ReplitTasks;

public class Replit119 {

    public static String censorLetter(String s, char c){
      char[] chars=s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]==c){
                chars[i]='*';
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("trick or treat",'t'));
    }
}
