import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6_3{

    //Atributos
    private List<Integer> numeros;

    //Constructor
    public Ejercicio6_3(List<Integer> numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public List<Integer> devolverValoresCentrales() {

        List<Integer> valoresCentrales = new ArrayList<Integer>();

        if (numeros.size() % 2 == 0) {

            valoresCentrales.add(numeros.get(numeros.size() / 2 - 1));
            valoresCentrales.add(numeros.get(numeros.size() / 2));

        } else {

            System.out.println("La lista no es de longitud par");

        }

        return valoresCentrales;

    }

    //Main
    public static void main(String[]args) {

        List<Integer> numerosEjemplo = new ArrayList<Integer>();

        numerosEjemplo.add(6);
        numerosEjemplo.add(2);
        numerosEjemplo.add(4);
        numerosEjemplo.add(1);

        Ejercicio6_3 ejemplo = new Ejercicio6_3(numerosEjemplo);
        
        System.out.println(ejemplo.devolverValoresCentrales());
        
    }

}