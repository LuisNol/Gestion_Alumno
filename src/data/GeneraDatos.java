package data;
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

    public void generarDatosDocente(){
        docentes.add(new Docente(9873453, "Gardin", 34, "masculino", "Tingo Maria", "987569844", "redes", "Redes y seguridad", "magister"));
        docentes.add(new Docente(101234567, "Ana Rodriguez", 35, "Matemáticas"));
        docentes.add(new Docente(205678912, "Juan Perez", 42, "Historia"));
        docentes.add(new Docente(308765432, "María García", 28, "Física"));
        docentes.add(new Docente(401234567, "Pedro Gomez", 39, "Química"));
        docentes.add(new Docente(504567890, "Laura Ramirez", 45, "Literatura"));
        docentes.add(new Docente(607654321, "Jorge Vargas", 52, "Economía"));
        docentes.add(new Docente(701234567, "Marta Martinez", 31, "Biología"));
        docentes.add(new Docente(804567890, "Pablo Cruz", 48, "Inglés"));
        docentes.add(new Docente(907654321, "Carla Herrera", 37, "Educación física"));
        docentes.add(new Docente(100123456, "Diego Castro", 29, "Informática"));
    }
}
