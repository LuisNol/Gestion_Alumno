package main;
import controlador.ControladorAlumno;
import modelo.Alumno;
import vista.AlumnoUI;

public class Main {
    public static void main(String[] args) {
        Alumno alumno= new Alumno();
        ControladorAlumno controladorAlumno = new ControladorAlumno(alumno);
        controladorAlumno.generarNotaParciales(10);
        AlumnoUI alumnoUI = new AlumnoUI(alumno);
        alumnoUI.reporte();
    }
}
