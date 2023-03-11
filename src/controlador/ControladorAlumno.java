package controlador;
import modelo.Alumno;
import util.Numero;

public class ControladorAlumno{
    
    private Alumno alumno;
    public ControladorAlumno(Alumno alumno){
        this.alumno = alumno;
    }

    /**
     * 
     * 
     * @param cantidad representa la cantidad de parciales
     */
    public void generarNotaParciales(int cantidad){
        for(int i = 0 ; i < cantidad ; i++){
            
            System.out.println("hola");
        }
    }
}
