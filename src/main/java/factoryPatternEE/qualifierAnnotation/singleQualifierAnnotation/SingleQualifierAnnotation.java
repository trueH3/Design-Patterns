package factoryPatternEE.qualifierAnnotation.singleQualifierAnnotation;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface SingleQualifierAnnotation {

    Type value();
    enum Type{MESSAGEA, MESSAGEB}
}
