package singletonPlainCode;

public class SingletonPattern3 {

    private static volatile SingletonPattern3 mySingleton3;

    public static SingletonPattern3 getMySingleton3 (){
        if(mySingleton3 == null){
            synchronized (SingletonPattern3.class){
                if(mySingleton3 == null){
                    mySingleton3 = new SingletonPattern3();
                }
            }
        }
        return  mySingleton3;
    }

    private SingletonPattern3(){}
}
