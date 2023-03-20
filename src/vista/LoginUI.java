package vista;
import java.util.Scanner;
import controlador.LoginControlador;
import modelo.Alumno;
import util.LimpiarPantalla;

public class LoginUI {

    LoginControlador loginControlador;

    public LoginUI(LoginControlador loginControlador) {
        this.loginControlador = loginControlador;
    }

    public Alumno iniciarSesion(){
        Scanner input = new Scanner(System.in);
        int cedula;
        Alumno alumno;
        
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("|                    BIENVENIDO                 |");
            System.out.println("|                    INICIAR SESIÓN             |");
            System.out.println("-------------------------------------------------");
            System.out.print("Ingresar Cedula: ");
            cedula = input.nextInt();
            alumno = loginControlador.validarUsuario(cedula);
            if(alumno == null){
                LimpiarPantalla.cls();
            }
        } while (alumno == null);

        System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        
        return alumno;
    }

}
