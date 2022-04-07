public class EjercicioExcepc4{

    //Constructor
    public EjercicioExcepc4() {

    }

    //Métodos
    public void hacerAlgo(Integer num) {

        System.out.println(num * 2);

    }

    //Main
    public static void main(String[]args) {

        EjercicioExcepc4 ejemplo = new EjercicioExcepc4();

        //Comprobamos la excepción
        try {

            ejemplo.hacerAlgo(null);

        } catch (NullPointerException e) {

            System.out.println("El valor es nulo");
            e.printStackTrace();

        } finally {

            System.out.println("Esta comprobacion ha sido patrocinada por NordVPN");

        }
        
    }

}