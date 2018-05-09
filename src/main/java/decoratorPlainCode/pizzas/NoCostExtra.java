package decoratorPlainCode.pizzas;

public class NoCostExtra extends Extra {

    public NoCostExtra(String label, double price, Order order) {
        super(order, label, price);
    }

    public NoCostExtra(String label, Order order){
        this.label = label;
        this.order = order;
    }

    @Override
    public double getPrice() {
        return order.getPrice();
    }
}
