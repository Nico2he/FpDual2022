import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6_2{

    //Atributos
    private List<Integer> numeros;

    //Constructor
    public Ejercicio6_2(List<Integer> numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public boolean verificarDosTres() {

        boolean noContiene = true;

        for (int i = 0; i < numeros.size() - 1; i++) {

            if (numeros.get(i) == 2 || numeros.get(i) == 3) {

                noContiene = false;

            }

        }

        return noContiene;

    }

    //Main
    public static void main(String[]args) {

        List<Integer> numerosEjemplo = new ArrayList<Integer>();

        numerosEjemplo.add(6);
        numerosEjemplo.add(2);
        numerosEjemplo.add(4);
        numerosEjemplo.add(1);

        Ejercicio6_2 ejemplo = new Ejercicio6_2(numerosEjemplo);
        
        System.out.println(ejemplo.verificarDosTres());
        
    }

}