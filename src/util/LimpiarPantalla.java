package util;

public class LimpiarPantalla {
    public static void cls (){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          } catch (Exception e) {
            System.out.println(e);
          }
    }
}
