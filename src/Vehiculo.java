public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    // constructor

    public Vehiculo(String placa, String marca, String modelo, int anio, double precioBase) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    // getters y setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // metodo abstracto

    public abstract double calcularPrecioFinal();

    // metodo propio

    public String mostrarFicha() {
        return "Placa: " + placa +
                " | Marca: " + marca +
                " | Modelo: " + modelo +
                " | Año: " + anio;
    }
}