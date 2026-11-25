import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Propietario p1 = new Propietario("Carlos", "1723456789");
        Propietario p2 = new Propietario("Maria", "1712345678");
        Propietario p3 = new Propietario("Pedro", "1709876543");
        Vehiculo v1 = new Automovil("ABC-123", "Toyota", "Corolla", p1, 4);
        Vehiculo v2 = new Motocicleta("XYZ-456", "Yamaha", "FZ", p2, 150);
        Vehiculo v3 = new Automovil("DEF-789", "Chevrolet", "Spark", p3, 4);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        System.out.println("SISTEMA DE VEHICULOS");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("-------------------------");
            System.out.println(vehiculo.mostrarInformacion());
        }
    }
}