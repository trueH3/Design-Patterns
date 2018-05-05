package factoryPatternEE.qualifierAnnotation;

import factoryPatternEE.qualifierAnnotation.singleQualifierAnnotation.SingleQualifierAnnotation;

import javax.enterprise.inject.Produces;

public class EventProducerQualifier {

    @Produces
    @SingleQualifierAnnotation(SingleQualifierAnnotation.Type.MESSAGEA)
    public MessageA messageAFactory(){
        return new MessageA();
    }

    @Produces
    @SingleQualifierAnnotation(SingleQualifierAnnotation.Type.MESSAGEB)
    public MessageB messageBFactory(){

        return new MessageB();
    }
}
