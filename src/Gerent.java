public class Gerent extends Empleat {
    private int bonus;

    public Gerent(String nom, double salariBase, int bonus) {
        super(nom, salariBase);

        this.bonus = bonus;
    }

    @Override
    public void calcularSalari() {
        double calculo = (super.getSalariBase() * bonus) * 0.8;

        System.out.println("Gerente: " + calculo);
    }
}
