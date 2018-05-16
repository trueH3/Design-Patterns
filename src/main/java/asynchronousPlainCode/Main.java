package asynchronousPlainCode;

public class Main {

    public static void main (String [] args) throws InterruptedException {

        //1-st option
        (new Thread( new AsyncRunnable())).start();

        //2-nd option
        (new Thread(() -> System.out.println("this one is using lambdas"))).start();

        //3-rd option
        Thread t1 = new Thread(new AsyncRunnableExtendsThread());
        t1.start();

    }
}
