package util;
import java.util.Random;
public class Numero {
    /**
     * @param minimo tiene que ser mayor que cero
     * @param maximo tiene que ser menor que 20
     * @return retorna una nota para el alumno
     */
    public static int numeroAleatorio(int minimo, int maximo){
         Random rnd = new Random();
         return rnd.nextInt(maximo - minimo) + minimo;
    }
}
