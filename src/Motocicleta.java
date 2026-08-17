public class Motocicleta extends Vehiculo {

    private int cilindraje;

    // constructor

    public Motocicleta(String placa, String marca, String modelo, int anio,
                       double precioBase, int cilindraje) {

        super(placa, marca, modelo, anio, precioBase);

        this.cilindraje = cilindraje;
    }

    // getters y setters

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    // metodo abstracto

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Aquí estoy en calcularPrecioFinal de Motocicleta");
        return 0;
    }
}