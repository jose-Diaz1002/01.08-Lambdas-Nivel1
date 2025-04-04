package exercise7;

import java.util.List;

public class Exercise7 {
/*
Con la lista del ejercicio anterior, ahora ordénala al revés,
de cadena más larga a más corta.
 */
    public static void mixedElementsInverted (List<Object> numberYLetter ) {

        numberYLetter.stream()
            .map(Object::toString)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .forEach(System.out::println);
    }

}
