package modelo;
public class Docente extends Persona {
    private String area;
    private String especialidad;
    private String gradoAcademico;
    private int cedulaDocente;

    public Docente(int cedulaDocente, String nombre,int edad, String espacialidad){
        super(nombre,edad);
        this.cedulaDocente = cedulaDocente;
        this.especialidad = espacialidad;
    }
    
    public Docente(String nombre, int edad, String genero, String direccion, String telefono, String area, String especialidad, String gradoAcademico) {
        super(nombre, edad, genero, direccion, telefono);
        this.area = area;
        this.especialidad = especialidad;
        this.gradoAcademico = gradoAcademico;
    }

    public Docente(int cedulaDocente,String nombre, int edad, String genero, String direccion, String telefono, String area, String especialidad, String gradoAcademico){
        super(nombre,edad,genero,direccion,telefono);
        this.cedulaDocente = cedulaDocente;
        this.especialidad = especialidad;
        this.gradoAcademico = gradoAcademico;
    }

    // Getters y Setters

    public int getCedulaDocente() {
        return cedulaDocente;
    }
    
    public void setCedulaDocente(int cedulaDocente) {
        this.cedulaDocente = cedulaDocente;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getGradoAcademico() {
        return gradoAcademico;
    }
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
}
