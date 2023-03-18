package data;

import java.util.ArrayList;
import java.util.List;
import modelo.Alumno;
import modelo.Curso;
import modelo.Docente;

public class GeneraDatos {
    private List<Alumno> alumnos;
    private List<Docente> docentes;
    private List<Curso> cursos;

    

    public GeneraDatos(List<Alumno> alumnos, List<Docente> docentes, List<Curso> cursos) {
        this.alumnos = alumnos;
        this.docentes = docentes;
        this.cursos = cursos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void generarDatosAlumno() {
        alumnos.add(new Alumno(12345678, "Juan Perez", 18, "12th Grade", 95.5));
        alumnos.add(new Alumno(23456789, "Maria Rodriguez", 17, "11th Grade", 90.0));
        alumnos.add(new Alumno(34567890, "Pedro Gonzalez", 16, "10th Grade", 85.5));
        alumnos.add(new Alumno(45678901, "Ana Torres", 15, "9th Grade", 80.0));
        alumnos.add( new Alumno(56789012, "Luis Hernandez", 14, "8th Grade", 75.5));
        alumnos.add( new Alumno(67890123, "Carmen Lopez", 13, "7th Grade", 70.0));
        alumnos.add(new Alumno(78901234, "Carlos Martinez", 12, "6th Grade", 65.5));
    }
}
