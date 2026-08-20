import java.util.Scanner;

public class PruebaLibroCalificaciones {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

    miLibroCalificaciones.establecerCurso("Programacion II", "Ana Luisa", 4);

    System.out.println("El nombre inicial del curso es: " + miLibroCalificaciones.getNombreCurso());
    System.out.println("El profesor es: " + miLibroCalificaciones.getNombreProfesor());
    System.out.println("y las horas a la semana son: " + miLibroCalificaciones.getHorasCurso());
    System.out.println();

    System.out.print("Escriba el nombre del curso: ");
    String curso = entrada.nextLine();

    System.out.print("Escriba el nombre del profesor ");
    String profesor = entrada.nextLine();

    System.out.print("Escriba las horas a la semana del curso: ");
    int horas = entrada.nextInt();

    miLibroCalificaciones.establecerCurso(curso, profesor, horas);

    miLibroCalificaciones.mostrarMensaje();

    entrada.close();
}
}