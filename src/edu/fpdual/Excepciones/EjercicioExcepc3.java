public class EjercicioExcepc3{

    //Atributos
    private String palabra;

    //Constructor
    public EjercicioExcepc3(String palabra) {

        this.palabra = palabra;

    }

    //Métodos
    public void escribirPalabra() {

        System.out.println(palabra);

    }

    public String getPalabra() {

        return palabra;

    }

    public void setPalabra(String nuevaPalabra) throws ExcepcionNumeroLetras{

        if (nuevaPalabra.length() > 15) {

            throw new ExcepcionNumeroLetras("La palabra no puede tener mas de 15 letras");

        } else {

            palabra = nuevaPalabra;

        }

    }

    //Main
    public static void main(String[]args) {

        EjercicioExcepc3 ejemplo = new EjercicioExcepc3("Masterclass");
        ejemplo.escribirPalabra();

        //Comprobamos la excepción
        try {

            ejemplo.setPalabra("Hipopotomonstrosesquipedaliofobia");

        } catch (ExcepcionNumeroLetras e) {

            e.printStackTrace();

        } finally {

            System.out.println("Esta comprobacion ha sido patrocinada por NordVPN");

        }
        
    }

}