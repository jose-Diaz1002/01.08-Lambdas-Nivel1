package exercise6;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> numbersAndWords = List.of("Shoe", 200, "Suitcase", 157,
                "Master", 114, "Solve", 289, "Company", 50, "Write");

        System.out.println("--------------------------------");
        System.out.println("### Excercise 6 ###");
        System.out.println("--------------------------------");

        Exercise6.mixedElements(numbersAndWords);


    }
}
