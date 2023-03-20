package controlador;

import java.util.List;

import modelo.Alumno;
import modelo.Curso;
import modelo.Docente;

public class LoginControlador {

    private List<Alumno> alumnos;
    private List<Docente> docentes;
    private List<Curso> cursos;
    
    public LoginControlador(List<Alumno> alumnos,List<Docente> docentes){
        this.alumnos = alumnos;

        this.docentes = docentes;
        this.cursos = cursos;
    }

    public Alumno validarUsuario(int cedula){
        Alumno alumnoPorEncontrar = null;
        for(Alumno alumno : this.alumnos){
            if(alumno.getCedula() == cedula){
                alumnoPorEncontrar = alumno;
                break;
            }
        }
        return alumnoPorEncontrar;
    }

}
