public class Programador extends Empleado{

    protected int lineasDeCodigoPorHora;
    protected String lenguajeDominante;

    public Programador() {

        nombre = "Antonio Martínez Reina";
        cedula = "Oficina 2";
        edad = 32;
        casado = false;
        salario = 1637.32;
        lineasDeCodigoPorHora = 150;
        lenguajeDominante = "C++";

    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String cedula, boolean casado, double salario) {

        super(nombre, cedula, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;

    }

}