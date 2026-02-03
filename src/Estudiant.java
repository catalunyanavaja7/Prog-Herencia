public class Estudiant extends Persona{

    private int curs;
    private String carrera;

    public Estudiant(String nom, int edad,int curs, String carrera) {
        super(nom, edad);
        this.curs = curs;
        this.carrera = carrera;

    }

    public void mostrarDades() {
        System.out.println(super.getNom());
        System.out.println(super.getEdad());
        System.out.println(curs);
        System.out.println(carrera);
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
