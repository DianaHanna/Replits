package ReplitTasks;

import javax.naming.NamingEnumeration;

public class Replit129 {

    static String country;
    static String continent;

    void display() {
        System.out.println(country + " located on " + continent + " continent");
    }

    public static void main(String[] args) {
        country="Morocco";
        continent="Africa";

        Replit129 main=new Replit129();
        main.display();
        }
    }
