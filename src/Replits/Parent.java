package Replits;

public class Parent {
    String city;

    public Parent(String city) {
        System.out.println(city);
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child(String city) {
        super(city);
    }

    public static void main(String[] args) {

        Child child=new Child("Vienna");

    }
}