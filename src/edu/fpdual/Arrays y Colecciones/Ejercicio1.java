public class Ejercicio1{

    //Atributos
    private int[] numeros;

    //Constructor
    public Ejercicio1(int[] numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public boolean verificarSeis() {

        boolean haySeis = false;

        if (numeros[0] == 6 || numeros[numeros.length - 1] == 6) {

            haySeis = true;

        }

        return haySeis;

    }

    //Main
    public static void main(String[]args) {

        int[] numerosEjemplo = {6, 8, 2, 4, 1, 0};

        Ejercicio1 ejemplo = new Ejercicio1(numerosEjemplo);
        
        System.out.println(ejemplo.verificarSeis());
        
    }

}