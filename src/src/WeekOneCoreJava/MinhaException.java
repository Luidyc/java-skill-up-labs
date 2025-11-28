package WeekOneCoreJava;


public class MinhaException extends RuntimeException {
    public int codigo;

    public MinhaException(String message, int codigo) {
        super(message);
        this.codigo = codigo;
    }

}
