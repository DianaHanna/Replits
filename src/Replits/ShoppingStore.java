package Replits;

public class ShoppingStore {

    String item;
    double price;
    int quantity;

    public double itemTotalPrice() {
        double total = this.price * this.quantity;
        System.out.println(item+" Total Value " +total);
        return total;
    }

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

    ShoppingStore shoppingStore=new ShoppingStore("Blanket",24.995, 4 );

    ShoppingStore shoppingStore1=new ShoppingStore("Mattress", 219.59, 2);

        double total1 = shoppingStore.itemTotalPrice();
        double total2 = shoppingStore1.itemTotalPrice();
        double totalPurchase = total1 + total2;

        System.out.println("You purchased " + totalPurchase + " Today");

    }
}

