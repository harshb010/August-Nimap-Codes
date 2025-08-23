import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () ->
        {
            System.out.println(Thread.currentThread().getName());
        };

        for(int i=0;i<5;i++)
        {
            executorService.execute(task);
        }

        executorService.shutdown();
    }
}
