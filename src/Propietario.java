public class Propietario {
    private String nombre;
    private String cedula;
    public Propietario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String mostrarInformacion() {
        return "Nombre del propietario: " + nombre + "\nCedula: " + cedula;
    }
}