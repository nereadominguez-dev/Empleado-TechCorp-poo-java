public class Disenador extends Empleado implements Evaluables {
    public Disenador (String nombre) {
        super(nombre);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Calculando sueldo diseñador base + bonos por código.");
    }

    @Override
    public void realizarEvaluacion() {
        System.out.println("Evaluando commints diseñador y resolución de bugs.");
    }
}
