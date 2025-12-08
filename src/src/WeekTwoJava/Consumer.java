package WeekTwoJava;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private  int id;
    private BlockingQueue<Paciente> queue;
    Random random = new Random();


    public Consumer(int id, BlockingQueue<Paciente> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Paciente msg;
            while  ((msg = queue.take()).getId() != -1) {
                System.out.printf("Consumer %d consumed %d%n",
                        id, msg.getId());
                //Thread.sleep(random.nextInt(100));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
