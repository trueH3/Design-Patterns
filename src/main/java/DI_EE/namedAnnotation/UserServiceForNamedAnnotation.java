package DI_EE.namedAnnotation;


import DI_plainCode.UserDataRepository;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.inject.Named;


@Singleton
@Startup
public class UserServiceForNamedAnnotation {

    @Inject @Named
    private UserDataRepositoryNamedAnnotation UserDataRepositoryImpl2;

    @PostConstruct
    public void checker() {
        UserDataRepositoryImpl2.logCheck();
    }
}
