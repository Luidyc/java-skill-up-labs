package WeekOneCoreJava;


import java.lang.classfile.Superclass;

public class Polimorfismo {


    public static class Animal {
            private String raça;
            private String alimentação;
            private String força;

            public int velocidade() {
                return 0;
            }

            public String getRaça() {
                return this.raça;
            }

            public String getAlimentação() {
                return this.alimentação;
            }

            public String getForça() {
                return this.força;
            }

            public void setRaça(String raça) {
                this.raça = raça;
            }

            public void setAlimentação(String alimentação) {
                this.alimentação = alimentação;
            }

            public void setForça(String força) {
                this.força = força;
            }

            public Animal(String raça, String alimentação, String força) {
                this.raça = raça;
                this.alimentação = alimentação;
                this.força = força;
            }

            public Animal() {}

    }

    public static class AnimalMarinho extends Animal {
        private String som;
        private String ambiente;
        private String reprodução;

        public String getSom() {
            return this.som;
        }

        public String getAmbiente() {
            return this.ambiente;
        }

        public String getReprodução() {
            return this.reprodução;
        }

        public void setSom(String som) {
            this.som = som;
        }

        public void setAmbiente(String ambiente) {
            this.ambiente = ambiente;
        }

        public void setReprodução(String reprodução) {
            this.reprodução = reprodução;
        }

        public AnimalMarinho() {}


        public AnimalMarinho(String som, String ambiente, String reprodução, String raça, String alimentação, String força) {
            super(raça,alimentação,força);
            this.reprodução = reprodução;
            this.som = som;
            this.ambiente = ambiente;

        }

        @Override
        public int velocidade() {
            return 40;
        }
    }



}
