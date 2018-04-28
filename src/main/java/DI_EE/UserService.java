package DI_EE;

import DI_plainCode.User;
import DI_plainCode.UserDataRepository;

import javax.inject.Inject;

public class UserService {

    @Inject
    private UserDataRepository udr;

    public void persistUser(User user){

        udr.save(user);
    }
}
