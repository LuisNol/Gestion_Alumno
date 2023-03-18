package modelo;

public class Alumno extends Persona{
    private int cedula;
    private String grado;
    private double nota;

    public Alumno(){
        super();
    }

    public Alumno(int cedula,String nombre, int edad, String grado, double nota){
        super(nombre,edad);
        this.cedula = cedula;  
        this.grado = grado;
        this.nota = nota;
    }

    public Alumno(int cedula, String nombre, int edad, String grado, double nota,  String genero, String direccion, String telefono) {
        super(nombre, edad, genero, direccion, telefono);
        this.cedula = cedula;
        this.grado = grado;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getCedula() {
        return cedula;
    }

    public String getGrado() {
        return grado;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public void setGrado(String grado) {   
        this.grado = grado;
    }

    
}