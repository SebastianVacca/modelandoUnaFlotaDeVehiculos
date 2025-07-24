public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;

    public Vehiculo(String marca, String modelo, Integer anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void mostrarInfo(){
        System.out.printf("""
                == Información del vehiculo ==
                Marca: %s
                Modelo: %s
                Año: %d
                """, getMarca(), getModelo(), getAnio());
    }

    public void mover(){
        System.out.println("El vehículo se está moviendo.\n");
    }
}
