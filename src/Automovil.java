public class Automovil extends Vehiculo {
    private int cantidadPuertas;
    public Automovil(String placa, String marca, String modelo, Propietario propietario, int cantidadPuertas) {
        super(placa, marca, modelo, propietario);
        this.cantidadPuertas = cantidadPuertas;
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo: Automovil" + "\nCantidad de puertas: " + cantidadPuertas;
    }
}