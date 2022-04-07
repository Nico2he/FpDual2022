public class EjercicioExcepc1{

    public static void main(String[] args) {

        try {

            throw new Exception("Excepcion de ejemplo");

        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta excepcion ha sido patrocinada por NordVPN");

        }

    }

}