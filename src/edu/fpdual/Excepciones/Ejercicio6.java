public class Ejercicio6{

    //Atributos
    private Integer i;

    //Constructor
    public Ejercicio6(Integer i) {

        this.i = i;

    }

    //Métodos
    public int g(Integer j) throws NullPointerException{

        int suma = i + j;

        return suma;

    }

    public int f(Integer j) throws ExcepcionAzar{

        System.out.println("El numero introducido es "+j);

        try {

            int suma = this.g(j);
            
            return suma;

        } catch (NullPointerException e) {

            throw new ExcepcionAzar("El numero introducido no puede ser nulo");

        }
        
    }

    //Main
    public static void main(String[]args) {

        Ejercicio6 ejemplo = new Ejercicio6(8);

        //Comprobamos la excepción
        try {

            System.out.println(ejemplo.f(null));

        } catch (ExcepcionAzar e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta comprobacion ha sido patrocinada por NordVPN");

        }
        
    }

}