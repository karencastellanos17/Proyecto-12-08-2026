public class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    // constructor

    public Automovil(String placa, String marca, String modelo, int anio,
                     double precioBase, int numeroPuertas, String tipoCombustible) {

        super(placa, marca, modelo, anio, precioBase);

        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // getters y setters

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // metodo abstracto implementado

    @Override
    public double calcularPrecioFinal() {
        System.out.println("Aquí estoy en calcularPrecioFinal de Automovil");
        return 0;
    }
}