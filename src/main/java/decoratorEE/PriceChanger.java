package decoratorEE;

public abstract class PriceChanger implements Product {

    protected String label;
    protected double price;

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
    public abstract String generateLabel();
}
