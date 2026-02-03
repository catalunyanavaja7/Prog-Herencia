public class Vehicle {
    private String marca;
    private int velocitatMaxima;

    public Vehicle(String marca, int velocitatMaxima) {
        this.marca = marca;
        this.velocitatMaxima = velocitatMaxima;
    }

    public void mostrarInfo() {
        System.out.println(marca);
        System.out.println(velocitatMaxima);
    }

}
