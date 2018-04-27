package singletonPlainCode;

public class SingletonPattern {

    private static SingletonPattern mySingleton;

    public static synchronized SingletonPattern getMySingleton(){

        if(mySingleton == null){
            mySingleton = new SingletonPattern();
        }
        return mySingleton;
    }


    private SingletonPattern() {
    }
}
