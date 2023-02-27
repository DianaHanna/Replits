package Replits;

public class Parent2 {

    public Parent2() {
        System.out.println("Parent Constructor without argument");
    }

    public Parent2(int number) {

    }


    public static class Child2 extends Parent2 {
        public Child2() {
            super();
            System.out.println("Child constructor without argument");
        }

        public Child2(int number) {
            super(number);
            System.out.println(number);
        }
    }

        public static void main(String[] args) {

            Child2 child1 = new Child2();

            Child2 child2 = new Child2(10);
        }
    }
