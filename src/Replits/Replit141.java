package Replits;

public class Replit141 {
    /*
    Create the maxValue method that will accept int array and return the maximum value in the array.
    Method should be visible every class in any package!
     */

    public static int maxValue(int [] numbers){
        int maxValue = 0;
        for (int number : numbers) {
            if (number > maxValue) {
               maxValue=number;
            }
        }
        return maxValue;

    }
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}

