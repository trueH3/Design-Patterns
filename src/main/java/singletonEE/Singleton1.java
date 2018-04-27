package singletonEE;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;

@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@DependsOn("LogForSingleton1")
@Singleton
public class Singleton1 {

    @EJB
    LogForSingleton1 logForSingleton1;


    private Map <Integer, String> mapWithNames;

    @PostConstruct
    public void start (){
        logForSingleton1.logMessage("I should be second");
        mapWithNames = new HashMap<>();
    }

    @Lock(LockType.WRITE)
    public void addUser (Integer id, String name){
        mapWithNames.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName (Integer id){
        return mapWithNames.get(id);
    }
}
