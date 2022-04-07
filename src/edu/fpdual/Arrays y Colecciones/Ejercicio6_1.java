import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6_1{

    //Atributos
    private List<Integer> numeros;

    //Constructor
    public Ejercicio6_1(List<Integer> numeros) {

        this.numeros = numeros;

    }

    //Métodos
    public boolean verificarSeis() {

        boolean haySeis = false;

        if (numeros.get(0) == 6 || numeros.get(numeros.size() - 1) == 6) {

            haySeis = true;

        }

        return haySeis;

    }

    //Main
    public static void main(String[]args) {

        List<Integer> numerosEjemplo = new ArrayList<Integer>();

        numerosEjemplo.add(6);
        numerosEjemplo.add(8);
        numerosEjemplo.add(4);
        numerosEjemplo.add(1);

        Ejercicio6_1 ejemplo = new Ejercicio6_1(numerosEjemplo);
        
        System.out.println(ejemplo.verificarSeis());
        
    }

}