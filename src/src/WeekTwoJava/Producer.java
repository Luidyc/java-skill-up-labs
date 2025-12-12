package WeekTwoJava;

import WeekThreeJava.RateLimiter;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements  Runnable{
    RateLimiter rateLimiter = new RateLimiter(429,"api.com/atendimentos","ERROR SYSTEM DETECTED MORE REQUEST THEN SYSTEM CAPABILITES",1000);
    private final int id;
    private final BlockingQueue<Paciente> queue;
    Random random = new Random();

    public Producer(int id, BlockingQueue<Paciente> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            Paciente paciente = new Paciente(random.nextInt(100));
            try {
                rateLimiter.rateLimiter("paciente",3);
                System.out.printf("Producer %d produced %d%n",i,paciente.getId());
                queue.put(paciente);
                //Thread.sleep(random.nextInt(100));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        try {
            queue.put(new Paciente(-1));
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
