import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println("Вы ввели " + count(words) + " слов");
    }

    private static int count(String input) {
        String trimmedInput = input.trim();
        if (trimmedInput.isEmpty()) {
            return 0;
        }
        try {
            String[] resultTrimmed = trimmedInput.split("\\s");
            Arrays.toString(resultTrimmed);
            return resultTrimmed.length;
        } catch (RuntimeException e) {
        }


        return 0;
    }
}
