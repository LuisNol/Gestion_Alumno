
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import controlador.LoginControlador;
import data.GeneraDatos;
import modelo.Alumno;
import modelo.Curso;
import modelo.Docente;
import vista.AlumnoUI;
import vista.LoginUI;
import data.GeneraDatos;

public class App {
    private static Alumno alumno;
    private static Docente docente;
    public static void main(String[] args) throws Exception {

        //Actores
        List<Alumno> alumnos = new ArrayList<Alumno>();
        List<Docente> docentes = new ArrayList<Docente>();
        List<Curso> cursos = new ArrayList<Curso>();
        
        //recursos
        GeneraDatos generaDatos = new GeneraDatos(alumnos,docentes,cursos);
        LoginControlador loginControlador = new LoginControlador(alumnos, docentes);
        AlumnoUI alumnoUI = new AlumnoUI();
        LoginUI loginUI = new LoginUI(loginControlador);

        //logica
        generaDatos.generarDatosAlumno();
        alumno = loginUI.iniciarSesion();

    }
}
