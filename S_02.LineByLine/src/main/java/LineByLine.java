
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String sentence = scanner.nextLine();
            String[] split = sentence.split(" ");

            if (sentence.isEmpty()) {
                break;
            }

            for (String word : split) {
                System.out.println(word);
            }
        }


    }
}
