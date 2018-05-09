package decoratorEE;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Priority(Interceptor.Priority.APPLICATION)
@Decorator
public class PriceDiscountDecorator extends PriceChanger  {

    @Any
    @Inject
    @Delegate
    @ClearanceSale
    private Product product;

    @Override
    public String generateLabel() {
        product.setPrice(product.getPrice() * 0.5);
        product.setLabel(product.getLabel() + " (Discounted)");

        return product.generateLabel();
    }
}
