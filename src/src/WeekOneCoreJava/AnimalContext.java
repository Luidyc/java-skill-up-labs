package WeekOneCoreJava;

public class AnimalContext implements Animal{

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void doAction() {
        animal.doAction();
    }
}
