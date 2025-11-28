package WeekOneCoreJava;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {

    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    private List<T> repository = new ArrayList<>();


    public void save(T object) {
        repository.add(object);
        System.out.println(repository.getFirst());
    }

}
