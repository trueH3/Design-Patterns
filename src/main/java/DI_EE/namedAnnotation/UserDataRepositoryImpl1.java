package DI_EE.namedAnnotation;

import DI_plainCode.User;
import DI_plainCode.UserDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Named;

@Singleton
@Startup
@Named("UserDataRepositoryImpl1")
public class UserDataRepositoryImpl1 implements UserDataRepositoryNamedAnnotation {

    Logger LOG3 = LoggerFactory.getLogger(UserDataRepositoryImpl1.class);

    public void save(User user) {

    }


    public void logCheck() {
        LOG3.info("UserDataRepository1 was choosen");
    }
}
