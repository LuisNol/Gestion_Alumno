package vista;

import modelo.Alumno;

public class AlumnoUI {
    private Alumno alumno;

    public AlumnoUI (Alumno alumno){
        this.alumno = alumno;
    }

    public void reporte(){
        System.out.println("Nombre : " + alumno.getNombre() + 
        "\n" + "Edad : " + alumno.getEdad() + 
        "\n" + "cedula : " + alumno.getCedula() +
        "\n" + "Ciclo Academico : " + alumno.getGrado() );
        

    }
    
}
