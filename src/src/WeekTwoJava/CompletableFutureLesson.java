package WeekTwoJava;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureLesson {

    public void futureAsync(String carro) {
        CompletableFuture.supplyAsync(() -> carro)
                .thenApply(String::toUpperCase)
                .thenApply(String::length)
                .thenAccept(length ->
                        System.out.println("Tamanho do nome do carro "+ length))
                .join();
    }




}
