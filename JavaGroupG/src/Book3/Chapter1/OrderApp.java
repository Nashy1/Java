package Book3.Chapter1;


import java.text.NumberFormat;

public class OrderApp {
    static NumberFormat n = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setQuantityOrdered(111);
        order1.setUnitPrice(4.55);
        double total = order1.getOrderTotal();
        System.out.println(n.format(total));
    }
}
