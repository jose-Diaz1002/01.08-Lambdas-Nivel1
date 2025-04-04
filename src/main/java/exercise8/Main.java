package exercise8;

public class Main {

    public static void main(String[] args) {
        Exercise8 wordReverse = (word) -> new StringBuilder(word).reverse().toString();

        String originalWord = "Terminator";
        String reverseWord = wordReverse.reverse(originalWord);

        System.out.println("--------------------------------");
        System.out.println("### Excercise 8 ###");
        System.out.println("--------------------------------");
        System.out.println("original word: " + originalWord);
        System.out.println("--------------------------------");
        System.out.println("backward word: " + reverseWord);

    }
}
