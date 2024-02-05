public class Main {
    // Даны два отсортированных массива
    // Нужно написать тело метода sortingTwoArrays
    // В котором нужно соединить два входящих массива в один итоговый
    // При этом конечный массив должен быть так же отсортирован
    // Условие: пользоваться утилитарным классов Arrays ЗАПРЕЩЕНО
    // Нужно написать наиболее эффективный алгоритм объединения
    public static void main(String[] args) {

        int[] array1 = {1, 3, 8, 21, 24, 36, 39, 41, 47, 68, 69, 70};
        int[] array2 = {2, 3, 9, 22, 33, 37, 39, 40, 41, 55, 59, 79};

        int[] result = sortingTwoArrays(array1, array2);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }


    private static int[] sortingTwoArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i <  array1.length; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[array1.length + i] = array2[i];
        }

        int n = result.length;
        boolean swapped;

        do {
            swapped = false;
            for (var i = 1; i < n; i++) {
                if (result[i - 1] > result[i]) {
                    int temp = result[i - 1];
                    result[i - 1] = result[i];
                    result[i] = temp;

                    swapped = true;
                }
            }
        } while (swapped);
        return result;
    }
}
