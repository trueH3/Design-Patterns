package DI_EE.namedAnnotation;

import DI_plainCode.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Named;

@Singleton
@Startup
@Named("UserDataRepositoryImpl2")
public class UserDataRepositoryImpl2 implements UserDataRepositoryNamedAnnotation {

    Logger LOG3 = LoggerFactory.getLogger(UserDataRepositoryImpl2.class);


    public void save(User user) {

    }


    public void logCheck() {
        LOG3.info("UserDataRepositoryImpl2 was choosen");
    }
}
