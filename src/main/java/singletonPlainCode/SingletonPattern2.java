package singletonPlainCode;

public class SingletonPattern2 {

    private static final SingletonPattern2 MYSINGLETON2 = new SingletonPattern2();

    private SingletonPattern2(){
    }

    public static SingletonPattern2 getMysingleton2(){

        return MYSINGLETON2;
    }
}
