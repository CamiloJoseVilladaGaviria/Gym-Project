package ProyectoGYM;

import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {

    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Entrenamiento> listaEntrenamientoClientes = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static String nombreCliente;
    public static int edadCliente;
    public static int tipoMembresiaCliente;

    public static void agregarClientes() {
        System.out.println("BIENVENIDO A AGREGAR CLIENTES");
        System.out.println("POR FAVOR, INGRESE EL NOMBRE DEL CLIENTE");
        nombreCliente = scanner.next();
        System.out.println("POR FAVOR, INGRESE LA EDAD");
        edadCliente = scanner.nextInt();
        System.out.println("POR FAVOR, INGRESE EL TIPO DE MEMBRESIA DEL CLIENTE A AGREGAR");
        tipoMembresiaCliente = scanner.nextInt();
        Cliente nuevoCliente = new Cliente(nombreCliente, edadCliente, tipoMembresiaCliente);
        clientes.add(nuevoCliente);
        System.out.println("CLIENTE AGREGADO SATISFACTORIAMENTE");
    }

    public static void registrarEntrenamientos() {
        System.out.println("BIENVENIDO AL REGISTRO DE ENTRAMIENTOS");
        System.out.println("POR FAVOR, INGRESE EL NOMBRE DEL CLIENTE");
        String nombre = scanner.next();
        if (!nombre.equals(nombreCliente)) {
            System.out.println("NO VALIDO");
            return;
        } else {
            System.out.println("VALIDO");
        }
        System.out.println("POR FAVOR, INGRESE LA FECHA DEL ENTRENAMIENTO");
        int fecha = scanner.nextInt();
        System.out.println("POR FAVOR, INGRESE LA DURACION DE LOS MINUTOS");
        int duracionMinutos = scanner.nextInt();
        Entrenamiento registrarEntrenamiento = new Entrenamiento(nombre, fecha, duracionMinutos);
        listaEntrenamientoClientes.add(registrarEntrenamiento);
        System.out.println("ENTRENAMIENTO REGISTRADO SATISFACTORIAMENTE");

    }

    public static void eliminarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("NO HAY CLIENTES A ELIMINAR");
            return;
        }

        System.out.println("INGRESE EL NOMBRE DE LA PERSONA A ELIMINAR");
        String eliminarClientes = scanner.next();

        Boolean eliminado = false;

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getNombre().equalsIgnoreCase(eliminarClientes)) {

                clientes.remove(i);
                eliminado = true;
                System.out.println("CLIENTE ELIMINADO CON EXITO");
                break;
            }
        }

        for (int j = 0; j < listaEntrenamientoClientes.size(); j++) {
            if (listaEntrenamientoClientes.get(j).getNombre().equalsIgnoreCase(eliminarClientes)) {
                listaEntrenamientoClientes.remove(j);
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("CLIENTE NO ENCONTRADO");
        }
    }

    public static void mostrarInformacion() {
        System.out.println("BIENVENIDO A MOSTRAR LA INFORMACION DE LOS CLIENTES");

        if (clientes.isEmpty()) {
            System.out.println("LISTA DE CLIENTES VACÍA");
        } else {
            for (Cliente cliente : clientes) {
                cliente.mostrarInformacion();
            }
        }

        if (listaEntrenamientoClientes.isEmpty()) {
            System.out.println("LISTA DE ENTRENAMIENTOS VACÍA");
        } else {
            for (Entrenamiento entrenamiento : listaEntrenamientoClientes) {
                entrenamiento.mostrarDetalles();
            }
        }
    }

    public static void main(String[] args) {
        boolean flagMenu = true;
        while (flagMenu) {
            int op;
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1. PARA AGREGAR UN CLIENTE");
            System.out.println("2. PARA REGISTRAR UN ENTRENAMIENTO");
            System.out.println("3. PARA ELIMINAR UN CLIENTE");
            System.out.println("4. PARA MOSTRAR LA LISTA DE CLIENTES");
            System.out.println("5. PARA SALIR");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    agregarClientes();
                    break;

                case 2:
                    registrarEntrenamientos();
                    break;

                case 3:
                    eliminarClientes();
                    break;

                case 4:
                    mostrarInformacion();
                    break;

                case 5:
                    flagMenu = false;
                    System.out.println("HASTA LUEGO...");
                    break;

                default:
                    throw new Error("ERROR");
            }
        }
    }
}
