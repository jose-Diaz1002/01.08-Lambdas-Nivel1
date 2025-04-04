package exercise1;


import java.util.List;

public class Exercise1 {

    public static void wordsWithO(List<String> names) {

        names.stream()
                .filter((name) -> {
                    return name.contains("o");
                }).forEach((name) -> {
                    System.out.println(name);
                });

    }

    //esta es la amnera simplificada
    public static void wordsWithO2(List<String> names) {

        names.stream()
                .filter((name) -> name.contains("o"))
                .forEach(System.out::println);
    }
}



























