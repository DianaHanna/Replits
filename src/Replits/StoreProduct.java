package Replits;

public class StoreProduct {

    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public void displayMethod() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, double price) {
        this(label, price, "misc", false,24);
    }

    public StoreProduct(String label, double price, int stock) {
        this(label, price, "null",false, stock);

    }

    public static void main(String[] args) {

        StoreProduct sp1=new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        StoreProduct sp2=new StoreProduct("Paper Towels", 2.0);
        StoreProduct sp3=new StoreProduct("Paper Towels", 2.0,0);

        sp1.displayMethod();
        sp2.displayMethod();
        sp3.displayMethod();

    }
}