package exercise1;


import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void wordsWithO(List<String> names) {

        List<String> whithOList = names.stream()
                .filter((name) -> name.toLowerCase().contains("o"))
                .collect(Collectors.toList());

        whithOList.stream().forEach(System.out::println);

    }
}



























