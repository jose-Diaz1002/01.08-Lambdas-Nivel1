package exercise3;
/*
Crea una lista con los nombres de los meses del año. Imprime todos los elementos de la
lista con una lambda.
 */

import java.util.List;

public class Exercise3 {

    public static void montsList(List<String> months) {

        for (String mont : months){
            System.out.println(mont);
        }
    }
}
