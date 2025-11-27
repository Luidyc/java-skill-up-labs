package WeekOneCoreJava;

public class Composição {

    public static class Motor {
        private String montadora;

        public void setMontadora(String montadora) {
            this.montadora = montadora;
        }

        public String getMontadora() {
            return montadora;
        }
    }

    private String nomeCarro;
    private Motor motor;

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }
}
