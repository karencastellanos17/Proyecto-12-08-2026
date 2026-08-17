public class CamionCarga extends Vehiculo {

    private double capacidadToneladas;

    // constructor

    public CamionCarga(String placa, String marca, String modelo, int anio,
                       double precioBase, double capacidadToneladas) {

        super(placa, marca, modelo, anio, precioBase);

        this.capacidadToneladas = capacidadToneladas;
    }

    // getters y setters

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    // metodo abstracto

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Aquí estoy en calcularPrecioFinal de CamionCarga");
        return 0;
    }
}