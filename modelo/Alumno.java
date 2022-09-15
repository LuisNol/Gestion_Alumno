package modelo;



public class Alumno{
    private int cedula;
    private String nombre;
    private int edad;
    private String grado;
    private Nota nota;

    public Alumno(int cedula, String nombre, int edad, String grado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public Alumno(int cedula, String nombre, int edad, String grado,Nota nota){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.nota = nota;

    }

    public Alumno(){

    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setGrado(String grado) {   
        this.grado = grado;
     }
}