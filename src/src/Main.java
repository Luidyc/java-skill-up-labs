import WeekOneCoreJava.*;
import WeekThreeJava.LRUcacheLesson;
import WeekTwoJava.CompletableFutureLesson;
import WeekTwoJava.ExecutorServices;
import WeekTwoJava.ProducerConsumer;
import WeekTwoJava.Threads;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Polimorfismo.Animal animal = new Polimorfismo.Animal("Cachorro","Herbivoro","Fraco");
        Polimorfismo.AnimalMarinho animalMarinho = new Polimorfismo.AnimalMarinho("Ouuuunnnnn","Aquático","Assexuada","Baleia Gigante","Crustácio","Forte");

        System.out.println("Say hello to: "+animal.getRaça()+" - "+animal.getAlimentação()+" - "+animal.getForça());
        System.out.println("Vou trocar dados do animal");
        animal.setRaça("Baleia");
        animal.setAlimentação("Mamifero");
        animal.setForça("Forte");
        System.out.println("Say hello to: "+animal.getRaça()+" - "+animal.getAlimentação()+" - "+animal.getForça());
        System.out.println("Say hello to: "+animalMarinho.velocidade());
        System.out.println("Say hello to: "+animal.velocidade());

        StateTvOn tvOn = new StateTvOn();
        tvOn.doAction();

        StateTvOff tvOff = new StateTvOff();
        tvOff.doAction();

        TvStateContext tvContext = new TvStateContext();
        tvContext.setState(tvOn);
        tvContext.doAction();

        AnimalMarinho baleia = new AnimalMarinho();
        AnimalSavana leão = new AnimalSavana();
        baleia.doAction();
        leão.doAction();

        AnimalContext animalContext = new AnimalContext();
        animalContext.setAnimal(baleia);
        animalContext.doAction();

        Composição carroComposto = new Composição();
        Composição.Motor motorMarea = new Composição.Motor();
        motorMarea.setMontadora("Honda pq é bomba");
        carroComposto.setNomeCarro("Marea Turbo");
        carroComposto.setMotor(motorMarea);

        System.out.println(carroComposto.getNomeCarro() + " = " + carroComposto.getMotor().getMontadora());

        Herança carro = new Herança();
        carro.setNomeCarro("HB20");
        carro.setMontadora("Hyundai");

        System.out.println(carro.getNomeCarro() + " " + carro.getMontadora());

        String humano = "Eu sou uma pessoa - Human A";
        Generics<String> generics = new Generics<>();
        Generics<Animal> animalGenerico = new Generics<>();
        generics.setObject(humano);
        System.out.println(generics.getObject());
/*        animalGenerico.save(animalContext.getAnimal());

        Generics<String> error = new Generics<>();
        try { error.save(null); } catch (MinhaException e) {
            ErroPersonalizado erroPersonalizado = new ErroPersonalizado("Não foi possivel salvar ",
                    "Desculpe sistema não salvou",
                    500,"www.IAos.com");
            System.out.println(erroPersonalizado.toString());
            throw e;
        }
*/
        Reflection<Polimorfismo.Animal> getAnimalRefletido = new Reflection<>();
        getAnimalRefletido.setObject(animal);
        getAnimalRefletido.getInfo();
        Threads threads = new Threads();
        threads.calculadoraReceitas();
        threads.engineVerificada();
        CompletableFutureLesson futureLesson = new CompletableFutureLesson();
        futureLesson.futureAsync("Civic");
        futureLesson.futureAsync("Corolla");
        ExecutorServices executorServices = new ExecutorServices();
        executorServices.tarefa1();
        executorServices.exec();
        executorServices.callableComRetorno();

        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.run();

        LRUcacheLesson<String,Integer> cacheSystem = new LRUcacheLesson<>(3);
        cacheSystem.put("Banana",1);
        cacheSystem.put("Laranja",2);
        System.out.println(cacheSystem);
        //cacheSystem.get("Banana");
        // Se eu tirar o comentário Laranja será removido, porque "Banana" foi acessada recentemente.
        cacheSystem.put("Morango",3);
        System.out.println(cacheSystem);
        cacheSystem.put("Melão",4);
        System.out.println(cacheSystem);
    }
}