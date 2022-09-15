package util;

import java.util.Random;

public class Numero {

    /**
     * 
     * Se necesita implementar esta funcion para las notas
     * 
     * @param minimo tiene que ser mayor que cero
     * @param maximo tiene que ser menor que 20
     * @return retorna una nota para el alumno
     */
    public static int numeroAleatorio(int minimo, int maximo){
         Random rnd = new Random();
         return rnd.nextInt(maximo - minimo) + minimo;
    }
}
