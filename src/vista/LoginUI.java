package vista;

import java.util.List;
import java.util.Scanner;

import controlador.LoginControlador;
import modelo.Alumno;

public class LoginUI {

    LoginControlador loginControlador;

    public LoginUI (LoginControlador loginControlador){
        this.loginControlador = loginControlador;
    }

    private void nombreDelApp(){
        System.out.println("****************************************");
        System.out.println("*         GESTION DE ALUMNOS             *");
        System.out.println("****************************************");
    }

    public Alumno iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();
        int cedula;
        nombreDelApp();
        
        do{
            System.out.print("Numero de Cedula :");
            cedula = scanner.nextInt();
        }while(loginControlador.validarUsuario(cedula));
        return alumno;
    }

    
}
