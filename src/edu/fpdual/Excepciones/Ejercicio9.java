public class Ejercicio9{

    public static void main(String[] args) {

        int numero = (int)(Math.random() * 5 + 1);

        while (numero != 0) {

            if (numero != 3) {

                try {

                    throw new ExcepcionInutil("El numero "+numero+" no es igual a 3");

                } catch(ExcepcionInutil e) {

                    e.printStackTrace();

                    System.out.println("Siguiente numero al azar");

                    numero = (int)(Math.random() * 5 + 1);

                } 

            } else {

                numero = 0;

            }

        }

        System.out.println("El numero era igual a 3");

    }

}