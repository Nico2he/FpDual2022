public class Empleado{

    protected String nombre;
    protected String cedula;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado() {

        nombre = "Antonio Martínez Reina";
        cedula = "Oficina 2";
        edad = 32;
        casado = false;
        salario = 1637.32;

    }

    public Empleado(String nombre, String cedula, boolean casado, double salario) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;

    }

    public void mostrarClasificacion() {

        if (edad <= 21) {

            System.out.println("Principiante");

        } else if (edad >= 22 && edad <= 35) {

            System.out.println("Intermedio");

        } else {

            System.out.println("Senior");

        }

    }

    public void imprimirDatos() {

        System.out.println("Nombre: "+nombre+"\nCedula: "+cedula+"\nEdad: "+edad+"\nCasado: "+casado+"\nSalario: "+salario);

    }

    public void aumentarSalario(float porcentaje) {

        salario = salario * (1 + porcentaje / 100);

        System.out.println("El salario se ha actualizado, ahora es: "+salario+" €");

    }

    public static void main(String[]args) {

        Empleado empleado = new Empleado();
        empleado.mostrarClasificacion();
        empleado.imprimirDatos();
        empleado.aumentarSalario(5);
        
    }

}