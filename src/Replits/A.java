package Replits;

import javax.naming.NamingEnumeration;

public class A {
    public A() {
        System.out.println("I");
    }
}
    class B extends A {
        public B() {
            System.out.println("am");
        }
    }
    class C extends B{
            public C(){
                System.out.println("a tester");
            }


    public static void main(String[] args) {
        C c=new C();

    }
}
