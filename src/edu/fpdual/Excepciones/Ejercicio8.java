public class Ejercicio8{

    public static void main(String[] args) {

        int[] numeros = new int[10];

        try {

            for (int i = 0; i < 20; i++) {

               numeros[i] = (int)(Math.random() * 3 + 1);

            }

        } catch(ArrayIndexOutOfBoundsException e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta excepcion ha sido patrocinada por NordVPN");

        }

    }

}