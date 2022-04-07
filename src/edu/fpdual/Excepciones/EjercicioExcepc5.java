public class EjercicioExcepc5{

    //Atributos
    private String palabra;

    //Constructor
    public EjercicioExcepc5(String palabra) {

        this.palabra = palabra;

    }

    //Métodos
    public void g(String nuevaPalabraG) throws ExcepcionNumeroLetras{

        if (nuevaPalabraG.length() > 15) {

            throw new ExcepcionNumeroLetras("La palabra no puede tener mas de 15 letras (g)");

        } else {

            this.palabra = nuevaPalabraG;

        }

    }

    public void f(String nuevaPalabraF) throws ExcepcionAzar{

        System.out.println(nuevaPalabraF.length());

        try {

            this.g(nuevaPalabraF);

        } catch (ExcepcionNumeroLetras e) {

            throw new ExcepcionAzar("La palabra no puede tener mas de 15 letras (f)");

        }
        
    }

    //Main
    public static void main(String[]args) {

        EjercicioExcepc5 ejemplo = new EjercicioExcepc5("Hola");

        //Comprobamos la excepción
        try {

            ejemplo.f("Hipopotomonstrosesquipedaliofobia");

        } catch (ExcepcionAzar e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta comprobacion ha sido patrocinada por NordVPN");

        }
        
    }

}