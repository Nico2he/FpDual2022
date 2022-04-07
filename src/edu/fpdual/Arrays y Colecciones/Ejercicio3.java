import java.util.Arrays;

public class Ejercicio3{

    //Atributos
    private int[] numeros;

    //Constructor
    public Ejercicio3(int[] numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public int[] devolverValoresCentrales() {

        int[] valoresCentrales = new int[2];

        if (numeros.length % 2 == 0) {

            valoresCentrales[0] = numeros[(numeros.length / 2 - 1)];
            valoresCentrales[1] = numeros[(numeros.length / 2)];

        } else {

            System.out.println("El array no es de longitud par");

        }

        return valoresCentrales;

    }

    //Main
    public static void main(String[]args) {

        int[] numerosEjemplo = {6, 8, 3, 4, 1, 0};

        Ejercicio3 ejemplo = new Ejercicio3(numerosEjemplo);
        
        System.out.println(Arrays.toString(ejemplo.devolverValoresCentrales()));
        
    }

}