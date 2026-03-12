public class Programador extends Empleado implements Evaluables {
    public Programador(String nombre) {
        super(nombre);
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Calculando sueldo base + bonos por código.");
    }

    @Override
    public void realizarEvaluacion() {
        System.out.println("Evaluando commints y resolución de bugs.");
    }
}
