package decoratorEE;

public class Table implements Product {

    private String label = "Dining Table";
    private double price = 100;

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String generateLabel() {
        return price + ", " + label;
    }
}
