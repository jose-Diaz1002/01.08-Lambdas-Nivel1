package exercise3;

import java.util.List;

public class Exercise3 {

    public static void montsList(List<String> months) {

        months.stream().forEach(System.out::println);
    }
}
