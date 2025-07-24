public class App {
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, 4);
        Motocicleta miMoto = new Motocicleta("Honda", "CBR500R", 2023, 500);
        Camion miCamion = new Camion("Volvo", "FH16", 2021, 25000.0);

        miCoche.mostrarInfo();
        miCoche.mover();

        miMoto.mostrarInfo();
        miMoto.mover();

        miCamion.mostrarInfo();
        miCamion.mover();

        System.out.println("--- Demostración de polimorfismo (Vehículo) ---");
        Vehiculo vehiculo1 = miCoche;
        Vehiculo vehiculo2 = miMoto;
        Vehiculo vehiculo3 = miCamion;

        vehiculo1.mostrarInfo();
        vehiculo1.mover();
        System.out.println("-------------------");
        vehiculo2.mostrarInfo();
        vehiculo2.mover();
        System.out.println("-------------------");
        vehiculo3.mostrarInfo();
        vehiculo3.mover();
        System.out.println("-------------------");

        System.out.println("--- Demostración de polimorfismo (Arrancable) ---");
        // miCoche.arrancar();
        Arrancable arrancable1 = miCoche;
        Arrancable arrancable2 = miMoto;
        arrancable1.arrancar();
        arrancable2.arrancar();
    }
}
