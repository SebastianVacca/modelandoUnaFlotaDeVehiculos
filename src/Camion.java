public class Camion extends Vehiculo{
    private Double capacidadCarga;

    public Camion(String marca, String modelo, Integer anio, Double capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    public Double getCapacidadCarga(){
        return capacidadCarga;
    }

    @Override
    public void mover() {
        System.out.println("El camión está cargado y se está moviendo\n");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("Capacidad: %,.0f%n", this.getCapacidadCarga());
    }
}
