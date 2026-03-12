public class Main {
    public static void main(String[] args){
        Programador p1 = new Programador("Ana");
        Programador p2 = new Programador("Luis");

        Disenador d1 = new Disenador("Nerea");
        Disenador d2 = new Disenador("Pablo");

        Administrativo a1 = new Administrativo("Belén");
        Administrativo a2 = new Administrativo("Carmen");

        p1.calcularSueldo();
        p1.realizarEvaluacion();
        d1.calcularSueldo();
        d2.realizarEvaluacion();
        a1.calcularSueldo();
        a2.realizarEvaluacion();

        System.out.println("Total empleados: " + Empleado.obtenerTotal());
    }
}