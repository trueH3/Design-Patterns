package InterceptorEE.exerciseOutOfBook;


import javax.ejb.Stateless;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.ExcludeDefaultInterceptors;
import javax.interceptor.Interceptors;

@Interceptors({ AnotherSimpleInterceptor.class, SimpleInterceptor.class})
@Stateless
public class SimpleEJB {

    //@ExcludeClassInterceptors
    public String printMessage(String message){
        System.out.println("Executing method: printMessage "+ message);

        return "Message is "+message;
    }
}
