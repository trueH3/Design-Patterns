package InterceptorEE.exerciseOutOfBook;


import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors(SimpleInterceptor.class)
public class SimpleEJB {


    public String printMessage(String message){
        System.out.println("Executing method: printMessage "+ message);

        return "Message is "+message;
    }
}
