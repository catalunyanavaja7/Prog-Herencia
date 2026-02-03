public class Professor extends Persona{
    private int sou;
    private String titulacio;


    public Professor(String nom, int edad, int sou, String titulacio) {
        super(nom, edad);

        this.sou = sou;
        this.titulacio = titulacio;
    }

    public void mostrarDades() {
        System.out.println(super.getNom() + "\n" + super.getEdad() + "\n" + sou + "\n" + titulacio);
    }

    public int getSou() {
        return sou;
    }

    public String getTitulacio() {
        return titulacio;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    public void setTitulacio(String titulacio) {
        this.titulacio = titulacio;
    }
}
