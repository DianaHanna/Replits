package ReplitTasks;

import java.util.MissingFormatArgumentException;

public class MainTester {
    public static void main(String[] args) {
        Main main=new Main();
        main.name="Husky";
        main.breed="Siberian";
        main.color="Grey";
        System.out.print(main.name+" ");
        main.bark();
        System.out.print(main.name+" ");
        main.run();
        System.out.print(main.name+" ");
        main.paly();



        Main main1=new Main();
        main1.name="Bulldog";
        main1.breed="American";
        main1.color="White";
        System.out.print(main1.name+" ");
        main1.bark();
        System.out.print(main1.name+" ");
        main1.run();
        System.out.print(main1.name+" ");
        main1.paly();

        Main main2=new Main();
        main2.name="Labrador";
        main2.breed="British";
        main2.color="Brown";
        System.out.print(main2.name+" ");
        main2.bark();
        System.out.print(main2.name+" ");
        main2.run();
        System.out.print(main2.name+" ");
        main2.paly();



    }
}
