package WeekTwoJava;

public class Benchmark {
    private long start;
    private long end;

    public void start() {
        start = System.nanoTime();
    }

    public void end() {
        end = System.nanoTime();
    }


    public double getMillis() {
        return (end - start) / 1_000_000.0;
    }

}
