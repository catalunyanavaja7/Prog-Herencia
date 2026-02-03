public class Rectangle extends Quadrat {
    private double altura;

    public Rectangle(double base, double altura) {
        super(base);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double resultat = super.getBase() * altura;
        return resultat;
    }
}
