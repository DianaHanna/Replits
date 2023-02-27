package Replits;

public class Replit122 {

    String countryName;
    String capital;
    long populationSize;

    void displayInfo(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+populationSize);
    }

    public static void main(String[] args) {

        Replit122 object1=new Replit122();
        object1.countryName="USA";
        object1.capital="Washington DC";
        object1.populationSize=330000000;
        object1.displayInfo();

        Replit122 objesct2=new Replit122();
        objesct2.countryName="Kazakhstan";
        objesct2.capital="Astana";
        objesct2.populationSize=18500000;
        objesct2.displayInfo();
    }
}
