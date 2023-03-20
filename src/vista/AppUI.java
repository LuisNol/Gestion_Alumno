package vista;
import java.util.List;
import java.util.Scanner;
import controlador.LoginControlador;
import modelo.Alumno;
import modelo.Docente;
import util.LimpiarPantalla;

public class AppUI {

    private LoginControlador loginControlador;
    private LoginUI loginUI;
    
    public AppUI(List<Alumno> alumnos, List<Docente> docentes){
        this.loginControlador =  new LoginControlador(alumnos, docentes);

        //Generando Datos
  
        //inyecciones
        loginUI = new LoginUI(loginControlador);

    }

    public void init(){
        //clses
        Alumno alumno;
        
        LimpiarPantalla.cls();

        //funcionalidades
        try{
            alumno = loginUI.iniciarSesion();
            if(alumno != null){
                LimpiarPantalla.cls();
                menu(alumno);
            }else{
                System.out.println("Error alumno no encontado");
            }
        }catch(NullPointerException e){
            System.out.println("Error al ingresar");
        }
        
    }

    private void menu(Alumno alumno){
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("-------------------------------------------------");
        System.out.println("|                    BIENVENIDO                 |");
        System.out.println("|                  MENU DE OPCIONES             |");
        System.out.println("|                                               |");
        System.out.println("|                      "+ alumno.getNombre() + "               |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| 1. Realizar Examen                             |");
        System.out.println("| 2. Salir                                       |");
        System.out.println("-------------------------------------------------");

        do {
            System.out.print("Ingrese su elección: ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Ha seleccionado Realizar Examen.");
                    // Lógica para realizar examen
                    break;
                case 2:
                    System.out.println("Ha seleccionado Salir. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }

            System.out.println();
            System.out.println("-------------------------------------------------");
            System.out.println("|                  MENU DE OPCIONES             |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("| 1. Realizar Examen                             |");
            System.out.println("| 2. Salir                                       |");
            System.out.println("-------------------------------------------------");
        } while (choice != 2);
    }


    
}
