import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Необходимо считать с консоли сначала строку, а потом один символ
        // Определить его как переменную типа char
        // и подсчитать количество его вхождений в строку

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char chr = scanner.next().charAt(0);
        int count = countOccurrences(str, chr);
        System.out.println("символ: " + chr + " в строке "  + count + " раз");
    }

    private static int countOccurrences(String input, char target) {
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }

        return count;
    }
}
