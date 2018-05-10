package InterceptorEE.exerciseOutOfBook;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class SimpleInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {

        System.out.println("SimpleInterceptor - logging BEFORE calling method: " + context.getMethod().getName());

        Object[] allParameters = context.getParameters();

        if (allParameters[0] == null) {
            allParameters[0] = "Default value was chosen";
            context.setParameters(allParameters);
        }

        Object result = context.proceed();

        System.out.println("SimpleInterceptor - logging AFTER calling method :" + context.getMethod().getName());

        return result;
    }
}
