public abstract class Empleado {
    // Variable estática compartida ya que es genérica, un empleado no se define a sí mismo.
    public static int totalEmpleados = 0;

    private String nombre;

    // Constructor
    public Empleado (String nombre){
        this.nombre = nombre;
        totalEmpleados++;
    }

    // Método abstracto
    public abstract void calcularSueldo();

    public static int obtenerTotal(){
        return totalEmpleados;
    }

    //Getter
    public String getNombre(){
        return nombre;
    }
}
