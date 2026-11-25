public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private Propietario propietario;
    public Vehiculo(String placa, String marca, String modelo, Propietario propietario) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }
    public String mostrarInformacion() {
        return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\n" + propietario.mostrarInformacion();
    }
}