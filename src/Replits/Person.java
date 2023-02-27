package Replits;

public abstract class Person {

    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract void print();
}

class Employe extends Person {
    int salary;

    public Employe(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Person {
    int grade;

    public Student(String name, String lastName, int age, int grade) {
        super(name, lastName, age);
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}
class Retiree extends Person {
    String seniorActivity;

    public Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }

    @Override
    public void print() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }

        public static void main(String[] args) {
            Employe employe = new Employe("Joe", "Smith", 35, 35000);
            employe.print();

            Student student = new Student("Adam", "Smith", 15, 10);
            student.print();

            Retiree retiree = new Retiree("Frank", "Smith", 15, "tour");
            retiree.print();
        }
    }
