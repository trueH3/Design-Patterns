package asynchronousPlainCode.concurrencyFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class UsingExecutorService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnableTask = () -> {
            try {
                System.out.println("That's from runnableTask");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            System.out.println("That's from callableTask");
            TimeUnit.MILLISECONDS.sleep(1000);

            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        executorService.execute(runnableTask);
        Future<String> future = executorService.submit(callableTask);

        String result = null;
        try {
            result = future.get(200, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println(result + ", check if callableTask is finished: "+future.isDone());

        executorService.shutdown();


    }
}
