public class Ejercicio10_3 extends Ejercicio10_2{

    //Constructor
    public Ejercicio10_3() {

    }

    //Métodos
    @Override
    public void llamarExcepcion() throws ExcepcionUna{

        throw new ExcepcionUna("Esta es la excepcion una");

    }

    public static void main(String[]args) {

        Ejercicio10_1 ejemplo = new Ejercicio10_3();

        //Comprobamos la excepción
        try {

            ejemplo.llamarExcepcion();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta comprobacion ha sido patrocinada por NordVPN");

        }
        
    }

}