package WeekTwoJava;

import java.util.concurrent.*;

public class ProducerConsumer {
    public void run() {
        BlockingQueue<Paciente> queue = new LinkedBlockingQueue<>();
        Producer p1 = new Producer(27,queue);
        Producer p2 = new Producer(14, queue);
        Consumer c1 = new Consumer(1,queue);
        Consumer c2 = new Consumer(2,queue);

        ExecutorService services = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors());
        services.execute(p1);
        services.execute(p2);
        services.execute(c1);
        services.execute(c2);
        services.shutdown();

    }
}
