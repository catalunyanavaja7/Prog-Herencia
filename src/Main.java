import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gos perrito = new Gos("buldog");

        System.out.println("\n************** Perro:\n");

        perrito.ferSoroll();

        Cotxe seat = new Cotxe("seat", 90, 4);

        System.out.println("\n************** Coche:\n");

        seat.mostrarInfo();


        System.out.println("\n************** Estudiantes:\n");

        ArrayList<Estudiant> listaClase = new ArrayList<Estudiant>();


        String[][] datosEstudiantes = {
                {"Asuraxd", "20", "1", "DAM"},
                {"Hernan", "21", "1", "DAM?"},
                {"Curdumi", "19", "2", "Millonario"},
                {"Timus", "18", "1", "Kevin"}
        };

        for (String[] dato : datosEstudiantes) {
            listaClase.add(new Estudiant(dato[0], Integer.parseInt(dato[1]), Integer.parseInt(dato[2]), dato[3]));
        }

        System.out.println(listaClase.size());
        System.out.println("-------------------");
        for (Estudiant est : listaClase) {
            System.out.println("Nombre: " + est.getNom());
            System.out.println("Edad: " + est.getEdad());
            System.out.println("Curso: " + est.getCurs());
            System.out.println("Ciclo: " + est.getCarrera());
            System.out.println("-------------------");
        }

        Professor raul = new Professor("Raul", 80, 20, "Amargado premium");

        String[][] datosProfesores = {
                {"Raul", "80", "2300", "Amargado plus"},
                {"Teresa", "80", "2300", "No entiendo nada"},
                {"Adria", "80", "2300", "Fokin angular"},
                {"Sergi", "90", "2400", "No le hablen de politica"},
        };

        System.out.println("\n************** Profesores:\n");

        ArrayList<Professor> listaProfes = new ArrayList<>();

        for (String[] dato : datosProfesores) {
            listaProfes.add(new Professor(dato[0], Integer.parseInt(dato[1]), Integer.parseInt(dato[2]), dato[3]));
        }

        listaProfes.get(1).setSou(5000);

        for (Professor p : listaProfes) {
            System.out.println("Nombre: " + p.getNom());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Curso: " + p.getSou());
            System.out.println("Ciclo: " + p.getTitulacio());
            System.out.println("-------------------");
        }

        System.out.println("\n************** Empleados:\n");

        Empleat arturo = new Empleat("Arturo", 1300);

        arturo.calcularSalari();

        Gerent margarita = new Gerent("Margarita", 1300,2);

        margarita.calcularSalari();

        System.out.println("\n************** Figura:\n");



    }
}
