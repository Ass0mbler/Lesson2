import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxValue = 100;
        int minValue = -100;
        IntStream.range(minValue, maxValue).forEach(System.out::println);
        System.out.println(Math.random());
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
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
