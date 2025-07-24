public class Motocicleta extends Vehiculo implements Arrancable{
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
        System.out.println("La moto se está moviendo\n");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("CC: %d%n", getCilindrada());
    }

    @Override
    public void arrancar() {
        System.out.println("Introduce la llave, giras el switch, oprimes el botón de encender, \noprimes el clutch con la mano, colocas el cambio y aceleras");
    }
}
