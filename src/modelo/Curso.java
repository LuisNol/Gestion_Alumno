package modelo;

public class Curso {
    
    // Atributos
    private String nombre;
    private String codigo;
    private int creditos;
    private int cupoMaximo;
    private int cupoDisponible;
    private Docente profesor;
    private Alumno[] estudiantesInscritos;
    
    // Constructor
    public Curso(String nombre, String codigo, int creditos, int cupoMaximo, Docente profesor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.cupoMaximo = cupoMaximo;
        this.cupoDisponible = cupoMaximo;
        this.profesor = profesor;
        this.estudiantesInscritos = new Alumno[cupoMaximo];
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int getCupoMaximo() {
        return cupoMaximo;
    }
    
    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }
    
    public int getCupoDisponible() {
        return cupoDisponible;
    }
    
    public Docente getProfesor() {
        return profesor;
    }
    
    public void setProfesor(Docente profesor) {
        this.profesor = profesor;
    }
    
    public Alumno[] getEstudiantesInscritos() {
        return estudiantesInscritos;
    }
    
    // Métodos
    public boolean inscribirEstudiante(Alumno estudiante) {
        if (cupoDisponible > 0) {
            estudiantesInscritos[cupoMaximo - cupoDisponible] = estudiante;
            cupoDisponible--;
            return true;
        } else {
            return false;
        }
    }
    
    public int cantidadEstudiantesInscritos() {
        return cupoMaximo - cupoDisponible;
    }
    
    public double calcularPromedio() {
        double sumaNotas = 0;
        int cantidadNotas = 0;
        for (Alumno estudiante : estudiantesInscritos) {
            if (estudiante != null) {
                sumaNotas += estudiante.getNota();
                cantidadNotas++;
            }
        }
        if (cantidadNotas == 0) {
            return 0;
        } else {
            return sumaNotas / cantidadNotas;
        }
    }
    
}
