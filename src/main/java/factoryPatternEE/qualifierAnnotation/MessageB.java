package factoryPatternEE.qualifierAnnotation;

import javax.enterprise.inject.Alternative;

public class MessageB {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
