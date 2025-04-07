package exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void wordsWithOLess5Letters(List<String> names) {

        List<String> whithOList = names.stream()
                .filter((name) -> name.contains("o") && name.length() > 5)
                .collect(Collectors.toList());

        whithOList.stream().forEach(System.out::println);

    }

}
