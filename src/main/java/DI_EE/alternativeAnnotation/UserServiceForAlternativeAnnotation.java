package DI_EE.alternativeAnnotation;


import DI_EE.namedAnnotation.UserDataRepositoryNamedAnnotation;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class UserServiceForAlternativeAnnotation {

    @Inject
    private UserDataRepositoryNamedAnnotation userDataRepositoryNamedAnnotation;

    @PostConstruct
    public void checker() {
        userDataRepositoryNamedAnnotation.logCheck();
    }
}
