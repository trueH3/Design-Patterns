package InterceptorEE.usingCDI;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


@Secure
@Interceptor
public class SimpleBeanInterceptor {

    @AroundInvoke
    public Object intercept (InvocationContext context) throws Exception{

        System.out.println("This message should be displayed before SimpleBean content");

        return context.proceed();
    }
}
