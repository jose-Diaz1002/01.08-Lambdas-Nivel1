package exercise6;

import java.util.List;

public class Exercise6 {
    public static void mixedElements (List<Object> numberYLetter ) {

        numberYLetter.stream()
                .map(Object::toString)
                .sorted((s1, s2) -> s1.length() - s2.length())
                .forEach(System.out::println);
    }

}
