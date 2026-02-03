public class Cotxe extends Vehicle{
    private int nombrePortes;

    public Cotxe(String marca, int velocitatMaxima, int nombrePortes) {
        super(marca, velocitatMaxima);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(nombrePortes);
    }
}
