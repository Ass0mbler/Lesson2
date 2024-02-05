import java.util.Scanner;

public class Task7 {
    /*
 Вам необходимо написать программу, которая принимает строку от пользователя и создает новую строку, представляющую собой обратную конкатенацию символов введенной строки. Для этого используйте StringBuilder для построения новой строки.

Пример:

Введите строку: "Hello, World!"
Результат: "!dlroW ,olleH"
Подсказка:

Используйте StringBuilder для эффективной манипуляции символами строки.
Пройдите по исходной строке в обратном порядке и добавляйте символы в StringBuilder.
Выведите полученную строку в конце программы.
     */
    public static void main(String[] args) {
        System.out.println(revertStr());
    }

    private static StringBuilder revertStr(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        int len = stringBuilder.length();
        if (len<=1){
            return stringBuilder;
        }
        //stringBuilder1 = new StringBuilder(stringBuilder.replace(len+1, len-1, String.valueOf(stringBuilder)));
        return stringBuilder.reverse();

    }
}
