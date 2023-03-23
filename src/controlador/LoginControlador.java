package controlador;

import java.util.List;

import modelo.Alumno;
import modelo.Docente;

public class LoginControlador {

    private List<Alumno> alumnos;
    private List<Docente> docentes;
    
    public LoginControlador(List<Alumno> alumnos,List<Docente> docentes){
        this.alumnos = alumnos;
        this.docentes = docentes;
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

    public Docente validarDocente(int cedulaDocente){
        Docente docentePorEncontrar = null;
        for(Docente docente:this.docentes){
            if(docente.getCedulaDocente()==cedulaDocente){
                docentePorEncontrar = docente;
                break;
            }
        }
        return docentePorEncontrar;
    }

}
