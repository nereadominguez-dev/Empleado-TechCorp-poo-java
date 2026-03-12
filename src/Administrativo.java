public class Administrativo extends Empleado implements Evaluables {
    public Administrativo (String nombre) {
        super(nombre);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Calcula el sueldo base actualizado");
    }

    @Override
    public void realizarEvaluacion() {
        System.out.println("Evaluando commints de administración y resolución de bugs.");
    }
}
