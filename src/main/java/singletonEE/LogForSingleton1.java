package singletonEE;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class LogForSingleton1 {

    private Logger LOG;

    @PostConstruct
    public void start (){
        LOG = LoggerFactory.getLogger(LogForSingleton1.class);

        LOG.info("I started first!!");
    }

    public void logMessage (String msg){

        LOG.info(msg);
    }

}
