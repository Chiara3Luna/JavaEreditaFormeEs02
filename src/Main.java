    public class Main {
        public static void main(String[] args) {

            Forma[] forme = new Forma[2];

            forme[0] = new Quadrato(5.0);
            forme[1] = new Cerchio(3.0);

            for (Forma forma : forme) {
                System.out.println("Area: " + forma.calcolaArea());
            }
        }
    }
