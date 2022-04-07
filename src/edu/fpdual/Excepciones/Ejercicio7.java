public class Ejercicio7{

    public static void main(String[] args) {

        try {

            int num = (int)(Math.random() * 3 + 1);

            if (num == 1) {

                throw new ExcepcionInutil("ExcepcionInutil");

            } else if (num == 2) {

                throw new ExcepcionNumeroLetras("ExcepcionNumeroLetras");

            } else {

                throw new ExcepcionAzar("ExcepcionAzar");

            }

        } catch(ExcepcionInutil | ExcepcionNumeroLetras | ExcepcionAzar e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta excepcion ha sido patrocinada por NordVPN");

        }

    }

}