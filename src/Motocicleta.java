public class Motocicleta extends Vehiculo{
    private Integer cilindrada;

    public Motocicleta(String marca, String modelo, Integer anio, Integer cilindrada){
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada(){
        return cilindrada;
    }

    @Override
    public void mover() {
        System.out.println("La moto se está moviendo");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("CC: %d%n", getCilindrada());
    }
}
