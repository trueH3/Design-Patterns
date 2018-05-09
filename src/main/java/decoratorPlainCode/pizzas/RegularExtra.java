package decoratorPlainCode.pizzas;

public class RegularExtra extends Extra {

    public RegularExtra(String label, double price, Order order) {
        super(order, label, price);
    }

    @Override
    public double getPrice() {
        return order.getPrice()+this.price;
    }
}
