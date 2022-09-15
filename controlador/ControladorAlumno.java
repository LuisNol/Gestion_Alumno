package controlador;

import java.util.ArrayList;
import java.util.List;

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
            alumno.getNota().addParciales(Double.valueOf(Numero.numeroAleatorio(0, 20)));
        }
    }

    
}
