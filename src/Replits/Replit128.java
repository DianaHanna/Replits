package Replits;

public class Replit128 {

    public static String mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("Strings must be of equal length.");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }
        return result.toString();
    }
    String s1 = "12345";
    String s2 = "abcde";


}
