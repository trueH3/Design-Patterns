package factoryPatternEE.anyAnnotation;

import javax.enterprise.util.AnnotationLiteral;

public class MessageLiteral extends AnnotationLiteral<Message> implements Message {

    private static final long serialVersionUID = 1L;
    private Type type;


    public MessageLiteral(Type type) {
        this.type = type;
    }

    @Override
    public Type value() {
        return type;
    }
}
