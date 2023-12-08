    public class Quadrato extends Forma {
        private double lato;

        public Quadrato(double lato) {
            this.lato = lato;
        }

        @Override
        public double calcolaArea() {
            return lato * lato;
        }
    }
