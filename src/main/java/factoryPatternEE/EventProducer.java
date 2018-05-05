package factoryPatternEE;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;

public class EventProducer {

    @Produces
    public String getMessage(){
        return "Hello World";
    }

}
