package WeekOneCoreJava;

import java.lang.reflect.Field;

public class Reflection<T> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void getInfo() {
        System.out.println("oi");
        for (Field atributo : object.getClass().getDeclaredFields()) {
            System.out.println(atributo.getName());
        }
    }

}
