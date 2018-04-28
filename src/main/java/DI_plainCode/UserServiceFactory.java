package DI_plainCode;

public class UserServiceFactory {

    public UserService getInstance (){
        return new UserService(new UserDataRepositoryImpl());
    }
}
