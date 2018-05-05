package factoryPatternEE.qualifierAnnotation;

import factoryPatternEE.qualifierAnnotation.singleQualifierAnnotation.SingleQualifierAnnotation;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import javax.inject.Inject;

@Singleton
@Startup
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventServiceQualifier {

    @Inject
    @SingleQualifierAnnotation(SingleQualifierAnnotation.Type.MESSAGEA)
    private MessageA messageA;

    @Inject
    @SingleQualifierAnnotation(SingleQualifierAnnotation.Type.MESSAGEB)
    private MessageB messageB;

    @PostConstruct
    public void startService(){
        messageA.setMessage("This is message A.");
        messageB.setMessage("This is message B.");

        System.out.println("Start service call "+messageA.getMessage());
        System.out.println("Start service call "+messageB.getMessage());
    }
}
