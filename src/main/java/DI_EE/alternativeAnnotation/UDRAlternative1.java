package DI_EE.alternativeAnnotation;

import DI_EE.namedAnnotation.UserDataRepositoryImpl1;
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
public class UDRAlternative1 implements UserDataRepositoryNamedAnnotation {

    Logger LOG5 = LoggerFactory.getLogger(UDRAlternative1.class);

    public void save(User user) {

    }

    public void logCheck() {
        LOG5.info("UDRAlternative1 was choosen");
    }
}
