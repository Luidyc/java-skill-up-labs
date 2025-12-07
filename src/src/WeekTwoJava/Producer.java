package WeekTwoJava;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements  Runnable{

    private final int id;
    private final BlockingQueue<Paciente> queue;
    Random random = new Random();

    public Producer(int id, BlockingQueue<Paciente> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            Paciente paciente = new Paciente(random.nextInt(100));
            try {
                System.out.printf("Producer %d produced %d%n",id,paciente.getId());
                queue.put(paciente);
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        try {
            queue.put(new Paciente(-1));
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
