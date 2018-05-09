package decoratorPlainCode.pizzas;

public abstract class Extra implements Order  {

    protected Order order;
    protected String label;
    protected double price;


    public Extra() {
    }

    public Extra(Order order, String label, double price) {
        this.order = order;
        this.label = label;
        this.price = price;
    }

    public abstract double getPrice();

    @Override
    public String getLabel() {
        return order.getLabel()+", "+this.label;
    }
}
