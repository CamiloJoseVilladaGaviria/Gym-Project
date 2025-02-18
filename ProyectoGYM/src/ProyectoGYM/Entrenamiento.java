package ProyectoGYM;

public class Entrenamiento {

    private String nombre;
    private int fecha;
    private int duracionMinutos;

    public Entrenamiento(String nombre, int fecha, int duracionMinutos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void mostrarDetalles() {
        System.out.println("Entrenamiento{" + "nombre=" + nombre + ", fecha=" + fecha + ", duracionMinutos=" + duracionMinutos + '}');
    }

}
