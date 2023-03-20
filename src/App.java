import java.util.ArrayList;
import java.util.List;
import data.GeneraDatos;
import modelo.Alumno;
import modelo.Curso;
import modelo.Docente;
import vista.AppUI;

public class App {
    public static void main(String[] args) throws Exception {

        //Actores
        List<Alumno> alumnos = new ArrayList<Alumno>();
        List<Docente> docentes = new ArrayList<Docente>();
        List<Curso> cursos = new ArrayList<Curso>();
        
        //recursos
        GeneraDatos generaDatos = new GeneraDatos(alumnos, docentes, cursos);
        generaDatos.generarDatosAlumno();

        AppUI appUI = new AppUI(alumnos,docentes);
        appUI.init();
    }
}
