    public class Cerchio extends Forma {
        private double raggio;

        public Cerchio(double raggio) {
            this.raggio = raggio;
        }

        @Override
        public double calcolaArea() {
            return Math.PI * raggio * raggio; //Math.PI è il p greco in Java
        }
    }
