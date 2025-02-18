package ProyectoGYM;

public class Cliente {

    private String nombre;
    private int edad;
    private int tipoMembresia;

    public Cliente(String nombre, int edad, int tipoMembresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMembresia = tipoMembresia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTipoMembresia() {
        return tipoMembresia;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", tipoMembresia=" + tipoMembresia + '}');
    }
}
