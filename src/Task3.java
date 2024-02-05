import java.util.Random;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxValue = 100;
        int minValue = -100;
        Random random = new Random();
            for (int i = 1; i < array.length; i++) {
                array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        System.out.println("минимальное число: " + minValue);

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("максимальное число: " + maxValue);
        System.out.println("среднее арифметическое: " + maxValue + minValue / array.length);

    }
}
