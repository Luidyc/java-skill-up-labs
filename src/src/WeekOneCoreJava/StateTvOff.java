package WeekOneCoreJava;

public class StateTvOff implements State{
    @Override
    public void doAction() {
        System.out.println("Tv desligada");
    }
}
