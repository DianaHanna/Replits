package Replits;

public class Dog {

    private String dogName;
    private double dogWeight;
    private static String dogBreed = "Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public static String getDogBreed() {
        return dogBreed;
    }

    public static void setDogBreed(String dogBreed) {
        Dog.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        return dogName + " " + dogBreed + " " + dogWeight;
    }
    public static void main(String[] args) {
        Dog tarzan = new Dog("Tarzan", 50.0);
        Dog lucy = new Dog("Lucy", 10.0);

        System.out.println(tarzan);
        System.out.println(lucy);
    }
}

