/* Задача 2.1: Дано четное число N (>0) и символы с1 и с2. 
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов с1 и с2,
начиная с с1 
Пример:
ввод: 6, a, b
вернуть:ababab*/

package seminar_2.task_2_1;

import java.util.Scanner;

public class task_2_1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            System.out.printf("Введите четное число: ");
            int num = iScanner.nextInt();
            System.out.printf("Введите первый символ: ");
            String char_1 = iScanner.next();
            System.out.printf("Введите второй символ: ");
            String char_2 = iScanner.next();
            System.out.println(users_chars(char_1, char_2, num));
        }
    }

    public static String users_chars(String char_1, String char_2, int string_length) {
        StringBuilder users_char = new StringBuilder();
        for (int index = 0; index < string_length / 2; index++) {
            users_char.append(char_1).append(char_2);
        }
        return users_char.toString();
    }
}
// вернули стринг билдером это как?