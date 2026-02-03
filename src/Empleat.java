public class Empleat {
    private String nom;
    private double salariBase;

    public Empleat(String nom, double salariBase) {
        this.nom = nom;
        this.salariBase = salariBase;
    }

    public void calcularSalari() {
        double calculo = salariBase * 0.8;

        System.out.println("Empleado: " + calculo);
    }

    public double getSalariBase() {
        return salariBase;
    }
}
