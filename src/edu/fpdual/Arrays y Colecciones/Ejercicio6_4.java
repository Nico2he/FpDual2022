import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6_4{

    //Atributos
    private List<Integer> numeros;

    //Constructor
    public Ejercicio6_4(List<Integer> numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public List<Integer> getNumeros() {

        return numeros;

    }

    public void invertir() {

        Collections.reverse(numeros);

    }

    //Main
    public static void main(String[]args) {

        List<Integer> numerosEjemplo = new ArrayList<Integer>();

        numerosEjemplo.add(6);
        numerosEjemplo.add(2);
        numerosEjemplo.add(4);
        numerosEjemplo.add(1);

        Ejercicio6_4 ejemplo = new Ejercicio6_4(numerosEjemplo);

        ejemplo.invertir();
        
        System.out.println(ejemplo.getNumeros());
        
    }

}