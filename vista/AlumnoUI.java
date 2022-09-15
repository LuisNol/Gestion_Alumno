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
        
        System.out.println("------------- [Parciales] -----------------");
        alumno.getNota().getParciales().forEach(nota->{
            System.out.println("\t\t- " + nota);
        });

        System.out.println("------------ [Medio Curo] ----------------" + 
        "\n \t\t- " + alumno.getNota().getMedioCurso());

        System.out.println("----------- [Examen Final] --------------" + 
        "\n \t\t- " + alumno.getNota().getMedioCurso());

        System.out.println("\n              [Promedio] " + 
        "\n \t\t- " + alumno.getNota().getPromedio());
    }
    
}
