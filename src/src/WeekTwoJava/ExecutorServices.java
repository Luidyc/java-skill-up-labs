package WeekTwoJava;

import java.util.concurrent.*;

public class ExecutorServices {

    // Instância da classe de Execução cm Threads
    ExecutorService executor = Executors.newSingleThreadExecutor();

    /*
    *  Execução da Tarefa 01 - com Lambda.
    *  Recurso que permite não dá new Runnable
    */
    public void tarefa1() {
        executor.submit(()->System.out.println("Tarefa 01 - Async"));
    }



    public void exec() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tarefa 2 - Async Execute");
            }
        });
    }

    public void callableComRetorno(){
        Future<String> future = executor.submit(()->{
            System.out.println("Possibilidade de Call");
            return "Resultado Callable";
        });
        try {
            String result = future.get();
            System.out.println("Future get = "+ future.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    }
