package Replits;

public class Method {

    public static int sum2D(int[][] arr){

        int sum=0;
        for (int []row:arr) {
            for (int element:row) {
                sum+=element;
            }
        }
        return sum;
        }
    }


class MethodTester extends Method{
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum=sum2D(a);
        System.out.println(sum);
    }
}