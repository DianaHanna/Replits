package Replits;

public class Replit120 {
    int year;
    String schoolName;
    int batch;

    void printInfo(){
        System.out.println("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
    }
    public static void main(String[] args) {
        Replit120 replit120=new Replit120();
        replit120.year=2021;
        replit120.schoolName="Syntax";
        replit120.batch=9;
        replit120.printInfo();

    }
}
