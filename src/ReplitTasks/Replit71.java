package ReplitTasks;

public class Replit71 {
    public static void main(String[] args) {

        int[] values = new int[9];
        values[0]=45;
        values[1]=78;
        values[2]=12;
        values[3]=67;
        values[4]=55;
        values[5]=89;
        values[6]=23;
        values[7]=77;
        values[8]=88;

        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                System.out.print(values[i] + " ");
            }
        }
    }
}
