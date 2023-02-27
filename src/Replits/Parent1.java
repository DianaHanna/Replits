package Replits;

public class Parent1 {
    public Parent1() {
        System.out.println("This is Parent Constructor");
    }
}
class Child1 extends Parent1 {
    public Child1() {
        super();
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
    }
}