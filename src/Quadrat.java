public class Quadrat extends Figura {
    private double base;

    public Quadrat(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double resultat = base * base;
        return resultat;
    }

    public double getBase() {
        return base;
    }
}
