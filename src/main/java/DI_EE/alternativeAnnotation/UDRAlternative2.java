package DI_EE.alternativeAnnotation;

import DI_EE.namedAnnotation.UserDataRepositoryImpl2;
import DI_EE.namedAnnotation.UserDataRepositoryNamedAnnotation;
import DI_plainCode.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.inject.Alternative;


@Singleton
@Startup
@Alternative
public class UDRAlternative2 implements UserDataRepositoryNamedAnnotation {

    Logger LOG6 = LoggerFactory.getLogger(UDRAlternative2.class);


    public void save(User user) {

    }


    public void logCheck() {
        LOG6.info("UDRAlternative2 was choosen");
    }
}
