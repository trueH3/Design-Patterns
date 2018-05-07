package factoryPatternEE.anyAnnotation;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class Client {

    @Inject
    MessageFactory mf;

    @PostConstruct
    public void doMessage (){
        MessageType m = mf.getMessage(Message.Type.SHORT);
        m.setMessage("This is a short message");
        System.out.println(m.getMessage());
    }
}
