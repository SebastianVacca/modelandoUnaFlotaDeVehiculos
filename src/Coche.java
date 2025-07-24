public class Coche extends Vehiculo {
    private Integer numeroPuertas;

    public Coche(String marca, String modelo, Integer anio, Integer numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    public Integer getNumeroPuertas(){
        return numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El automovil se está moviendo");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("N° Puertas: %d%n", getNumeroPuertas());
    }
}

