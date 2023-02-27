package Replits;

public class carObject {

    String model;
    double price;
    int quantity;
    public void carStockValue() {
        double stockValue = price * quantity;
        System.out.println(model + " " + "Stock Value "+stockValue);
    }
    public carObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        carObject carObject1=new carObject("Toyota 2019",25000.0, 100);
        carObject1.carStockValue();

        carObject carObject2=new carObject("BMW 2019", 26119.2, 25);
        carObject2.carStockValue();
    }
}
