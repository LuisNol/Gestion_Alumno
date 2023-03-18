
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import data.GeneraDatos;
import modelo.Alumno;
import modelo.Curso;
import modelo.Docente;
import vista.AlumnoUI;
import vista.LoginUI;
import data.GeneraDatos;

public class App {
    public static void main(String[] args) throws Exception {

        //Actores
        List<Alumno> alumnos = new ArrayList<Alumno>();
        List<Docente> docentes = new ArrayList<Docente>();
        List<Curso> cursos = new ArrayList<Curso>();
        
        //recursos
        GeneraDatos generaDatos = new GeneraDatos(alumnos,docentes,cursos);
        AlumnoUI alumnoUI = new AlumnoUI();
        LoginUI loginUI = new LoginUI();

        //logica
        generaDatos.generarDatosAlumno();
        loginUI.iniciarSesion();
    }

}
