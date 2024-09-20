import biblioteca.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro librouno = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 500, 1967);
        Libro librodos = new Libro(" El Principito", "Antoine de Saint", 100, 1943);

        System.out.println("Datos de libro 1: ");


        librouno.mostrarDatosLibro();

        System.out.println("Datos de libro 2: ");

        librodos.mostrarDatosLibro();

        System.out.println("Nombre libro 1: " + librouno.getTitulo());
        librouno.setTitulo("El Perfume");
        System.out.println("Nombre libro uno modificado: " + librouno.getTitulo());
        }
    }
