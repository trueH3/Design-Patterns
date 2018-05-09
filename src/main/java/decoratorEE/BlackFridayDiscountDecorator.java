package decoratorEE;


import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;


@Priority(Interceptor.Priority.APPLICATION + 20)
@Decorator
public class BlackFridayDiscountDecorator extends PriceChanger {

    @Delegate
    @Any
    @Inject
    @ClearanceSale
    private Product product;

    @Override
    public String generateLabel() {

        product.setPrice(product.getPrice() * 0.25);
        product.setLabel(product.getLabel());

        return product.generateLabel();
    }
}
