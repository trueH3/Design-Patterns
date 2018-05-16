package asynchronousPlainCode;

public class AsyncRunnableExtendsThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running in class that extends Thread");
    }
}
