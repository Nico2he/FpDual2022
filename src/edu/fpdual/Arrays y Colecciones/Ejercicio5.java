import java.util.Arrays;

public class Ejercicio5{

    //Atributos
    private String[] strings;

    //Constructor
    public Ejercicio5(String[] strings) {

        this.strings = strings;

    }

    //Métodos
    public String[] devolverCadenasNumero() {

        int numStringsNumero = 0;

        for (int i = 0; i < strings.length; i++) {

            boolean contieneNumero = false;

            char[] arrayString = strings[i].toCharArray();

            for (int j = 0; j < arrayString.length; j++) {

                if (Character.isDigit(arrayString[j])) {

                    contieneNumero = true;

                }

            }

            if (contieneNumero == true) {

                numStringsNumero++;

            }

        }

        String[] arrayStringNumeros = new String[numStringsNumero];
        int pos = 0;

        for (int i = 0; i < strings.length; i++) {

            boolean contieneNumero = false;

            char[] arrayString = strings[i].toCharArray();

            for (int j = 0; j < arrayString.length; j++) {

                if (Character.isDigit(arrayString[j])) {

                    contieneNumero = true;

                }

            }

            if (contieneNumero == true) {

                arrayStringNumeros[pos] = strings[i];

                pos++;

            }

        }

        return arrayStringNumeros;

    }

    //Main
    public static void main(String[]args) {

        String[] stringsEjemplo = {"jahkj", "H0la", "lasjla", "s0y", "lanxja", "Nic0"};

        Ejercicio5 ejemplo = new Ejercicio5(stringsEjemplo);
        
        System.out.println(Arrays.toString(ejemplo.devolverCadenasNumero()));
        
    }

}