package decoratorEE;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Any;
import javax.inject.Inject;


@Singleton
@Startup
public class TableInstance {

    @ClearanceSale
    @Any
    @Inject
    Product product;

    @PostConstruct
    public void createPriceList() {
        System.out.println("Label: " + product.generateLabel());
    }
}
