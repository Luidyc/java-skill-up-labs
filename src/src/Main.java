import WeekOneCoreJava.Polimorfismo;

public class Main {
    public static void main(String[] args) {
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
    }
}