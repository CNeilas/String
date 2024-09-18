
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            String[] split = sentence.split(" ");

            if (sentence.isEmpty()) {
                break;
            }

            for (String word: split) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
