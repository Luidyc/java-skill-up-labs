package WeekTwoJava;

import java.util.ArrayList;
import java.util.List;

public class Threads {

    public void calculadoraReceitas() {
        new Thread() {
            @Override
            public void run() {
                ArrayList<Integer> numbers =new ArrayList<>(List.of(130,200,300,500,600,9000,5940));
                int soma = 0;
                int counter = 0;
                for(Integer number : numbers) {
                    soma = soma + number;
                    counter++;
                }
                System.out.println("O valor total deu: "+soma);
                System.out.println("O contador diz que temos: "+counter+" elementos");

            }
        }.start();
    }

    public void engineVerificada() {
        new Thread() {
            @Override
            public void run(){
                try {
                    System.out.println("Ligando engine");
                    sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
    }

}
