package InterceptorEE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


public class SecurityInterceptor {

    Logger LOG = LoggerFactory.getLogger(SecurityInterceptor.class);

    @AroundInvoke
    public Object doSecurityCheck(InvocationContext context) throws Exception{

    LOG.info(context.getMethod().getName()+ " is accessed!");

    return context.proceed();
    }
}
