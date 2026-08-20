public class LibroCalificaciones {
    private String nombreCurso;
    private String nombreProfesor;
    private int horasCurso;

    public void establecerCurso(String nombreCurso, String nombreProfesor, int horasCurso) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.horasCurso = horasCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getNombreProfesor(){
        return nombreProfesor;
    }
    public int getHorasCurso() {
        return horasCurso;
    }
    public void mostrarMensaje(){
        System.out.println("Bienvenido al libro de calificaciones para:");
        System.out.println("Curso: " + getNombreCurso());
        System.out.println("Profesor asignado: " + getNombreProfesor());
        System.out.println("Horas a la semana: " + getHorasCurso());

    }
    
 
}