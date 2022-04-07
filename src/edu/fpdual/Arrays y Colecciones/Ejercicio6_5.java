import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio6_5{

    //Atributos
    private List<String> strings;

    //Constructor
    public Ejercicio6_5(List<String> strings) {

        this.strings = strings;

    }

    //Métodos
    public List<String> devolverCadenasNumero() {

        List<String> arrayStringNumeros = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {

            boolean contieneNumero = false;

            char[] arrayString = strings.get(i).toCharArray();

            for (int j = 0; j < arrayString.length; j++) {

                if (Character.isDigit(arrayString[j])) {

                    contieneNumero = true;

                }

            }

            if (contieneNumero == true) {

                arrayStringNumeros.add(strings.get(i));

            }

        }

        return arrayStringNumeros;

    }

    //Main
    public static void main(String[]args) {

        List<String> stringsEjemplo = new ArrayList<String>();

        stringsEjemplo.add("jahkj");
        stringsEjemplo.add("H0la");
        stringsEjemplo.add("lasjla");
        stringsEjemplo.add("s0y");
        stringsEjemplo.add("lanxja");
        stringsEjemplo.add("Nic0");

        Ejercicio6_5 ejemplo = new Ejercicio6_5(stringsEjemplo);
        
        System.out.println(ejemplo.devolverCadenasNumero());
        
    }

}