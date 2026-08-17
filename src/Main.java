import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de inventario AutoMotion S.A.S");

    }

    // metodo para agregar un vehiculo

    public static void agregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v) {
        System.out.println("Aquí estoy en agregarVehiculo");
    }

    // metodo para listar el inventario

    public static void listarInventario(ArrayList<Vehiculo> inventario) {
        System.out.println("Aquí estoy en listarInventario");
    }

    // metodo para calcular el valor total del inventario

    public static double calcularValorTotalInventario(ArrayList<Vehiculo> inventario) {
        System.out.println("Aquí estoy en calcularValorTotalInventario");
        return 0;
    }

    // metodo para buscar un vehiculo por placa

    public static Vehiculo buscarPorPlaca(ArrayList<Vehiculo> inventario, String placa) {
        System.out.println("Aquí estoy en buscarPorPlaca");
        return null;
    }
}