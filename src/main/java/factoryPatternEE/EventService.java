package factoryPatternEE;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import javax.inject.Inject;

@Singleton
@Startup
@TransactionAttribute (TransactionAttributeType.REQUIRED)
public class EventService {

    @Inject
    private String message;

    @PostConstruct
    public void startService(){
        System.out.println("Start service call " + message);
    }
}
