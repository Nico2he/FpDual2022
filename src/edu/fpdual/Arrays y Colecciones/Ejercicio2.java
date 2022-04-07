public class Ejercicio2{

    //Atributos
    private int[] numeros;

    //Constructor
    public Ejercicio2(int[] numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public boolean verificarDosTres() {

        boolean noContiene = true;

        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] == 2 || numeros[i] == 3) {

                noContiene = false;

            }

        }

        return noContiene;

    }

    //Main
    public static void main(String[]args) {

        int[] numerosEjemplo = {6, 8, 3, 4, 1, 0};

        Ejercicio2 ejemplo = new Ejercicio2(numerosEjemplo);
        
        System.out.println(ejemplo.verificarDosTres());
        
    }

}