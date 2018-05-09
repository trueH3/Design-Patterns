package decoratorEE;

@ClearanceSale
public class Plate implements Product {

    private String label = "Plate";
    private double price = 50;

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
