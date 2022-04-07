import java.util.Arrays;

public class Ejercicio4{

    //Atributos
    private int[] numeros;

    //Constructor
    public Ejercicio4(int[] numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public int[] invertir() {

        int[] numerosInvertido = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {

            numerosInvertido[i] = numeros[numeros.length - 1 - i];

        }

        return numerosInvertido;

    }

    //Main
    public static void main(String[]args) {

        int[] numerosEjemplo = {6, 8, 3, 4, 1, 0};

        Ejercicio4 ejemplo = new Ejercicio4(numerosEjemplo);
        
        System.out.println(Arrays.toString(ejemplo.invertir()));
        
    }

}