package InterceptorEE.exerciseOutOfBook;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class SimpleInterceptor {

    private Object[] allParameters;

    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {

        System.out.println("SimpleInterceptor - logging BEFORE calling method: " + context.getMethod().getName());

        this.setDefaultParameter(context);

        Object result = context.proceed();

        System.out.println("SimpleInterceptor - logging AFTER calling method :" + context.getMethod().getName());

        return result;
    }

    private void setDefaultParameter(InvocationContext context) {

        allParameters = context.getParameters();

        if (allParameters[0] == null) {
            allParameters[0] = "Default value was chosen";
            context.setParameters(allParameters);
        }
    }

    @PostConstruct
    public void onStart(){

        System.out.println("Activating");
    }

    @PreDestroy
    public void onShutDown(){
        System.out.println("Deactivating");
    }
}
