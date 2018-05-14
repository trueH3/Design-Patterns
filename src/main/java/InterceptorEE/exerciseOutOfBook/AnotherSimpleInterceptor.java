package InterceptorEE.exerciseOutOfBook;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class AnotherSimpleInterceptor {

    @AroundInvoke
    public Object intercept (InvocationContext context) throws Exception{

        Object proceed = context.proceed();

        System.out.println("This message should appear at the end of program execution and after first interceptor :)");

        return proceed;
    }
}
