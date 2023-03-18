package vista;

import java.util.List;

import modelo.Alumno;

public class AlumnoUI {

    private void reporte(Alumno alumno){
        System.out.println("\nNombre : " + alumno.getNombre() + 
        "\n" + "Edad : " + alumno.getEdad() + 
        "\n" + "cedula : " + alumno.getCedula() +
        "\n" + "Ciclo Academico : " + alumno.getGrado() );
    }

    public void obtenerTodoAlumnos(List<Alumno> alumnos) {
        alumnos.forEach(alumno->{
            reporte(alumno);
        });
    }
    
}
