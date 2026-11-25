public class Motocicleta extends Vehiculo {
    private int cilindrada;
    public Motocicleta(String placa, String marca, String modelo, Propietario propietario, int cilindrada) {
        super(placa, marca, modelo, propietario);
        this.cilindrada = cilindrada;
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo: Motocicleta" + "\nCilindrada: " + cilindrada + " cc";
    }
}