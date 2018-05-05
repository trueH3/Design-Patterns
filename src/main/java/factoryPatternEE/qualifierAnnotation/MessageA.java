package factoryPatternEE.qualifierAnnotation;

import javax.enterprise.inject.Alternative;

public class MessageA {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
