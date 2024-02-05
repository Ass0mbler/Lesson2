import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int maxValue = 100;
        int minValue = -100;

        // Заполнить массив сгенерированными числами, как в задаче номер 3.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue + 2) + minValue);
        }

        for (int num : array) {
            System.out.println(num);
            if (num <= 1) {  // здесь проверяется является ли каждый элемент массива array меньшим или равным 1
                System.out.println(false);
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j <= array.length; j++) {
                if (num % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(num + " - простое число");
            } else {
                if (hasSameFirstAndSecondDigit(num)) {
                    System.out.println(num + " - найдены одинаковые символы");
                    break;
                }
            }
        }
    }

    private static boolean hasSameFirstAndSecondDigit(int num) {
        String numStr = Integer.toString(num);
        if (numStr.length() >= 2) {
            return numStr.charAt(0) == numStr.charAt(1);
        }
        return false;
    }
}
