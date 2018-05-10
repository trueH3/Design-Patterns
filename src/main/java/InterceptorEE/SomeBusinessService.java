package InterceptorEE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.interceptor.Interceptors;

@Interceptors(SecurityInterceptor.class)
@Singleton
public class SomeBusinessService {


    Logger LOG2 = LoggerFactory.getLogger(SomeBusinessService.class);

    public void startService() {

        LOG2.info("done...");
    }

    public void startAnotherService() {

        LOG2.info("done again...");
    }
}
