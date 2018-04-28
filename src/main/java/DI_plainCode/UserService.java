package DI_plainCode;

public class UserService {

    private UserDataRepository udr;

    public UserService(UserDataRepository udr) {
        this.udr = udr;
    }

    public void persistUser(User user){

        udr.save(user);
    }

}
