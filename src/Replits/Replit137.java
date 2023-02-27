package Replits;

public class Replit137 {
    String name;
    public String city;
    protected String nameOfTheSchool;
    private int batchNumber;

    void display() {
        System.out.println("My name is " + name + " and I live in " + city + "." + " I study at " + nameOfTheSchool + " in batch " + batchNumber);
    }


    public static void main(String[] args) {
        Replit137 replit137=new Replit137();
        replit137.name="John";
        replit137.city="Miami";
        replit137.nameOfTheSchool="Syntax";
        replit137.batchNumber=9;
        replit137.display();
        }
    }