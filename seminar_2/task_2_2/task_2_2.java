/* Задача 2.2: Напишите метод, который сжимает строку.
Пример: 
ввод: aaabbbcddaaa
вывод: a4b3cd2a3 */
// .charAt(i) можно сравнивать строчки с помощью ==, без stroka.equals(stroka1)
package seminar_2.task_2_2;

import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            System.out.printf("Введите строку:  ");
            String user_string = iScanner.next();
            System.out.println(compress(user_string));
        }
    }

    public static String compress(String user_string) {
        int counter = 1;
        StringBuilder users_compress = new StringBuilder();
        for (int i = 0; i < user_string.length() - 1; i++) {
            if (user_string.charAt(i) == user_string.charAt(i + 1)) {
                counter++;
            } else {
                users_compress.append(user_string.charAt(i));
                if (counter != 1) {
                    users_compress.append(counter);
                    counter = 1;
                }

            }
        }
        users_compress.append(user_string.charAt(user_string.length() - 1));
        if (counter != 1) {
            users_compress.append(counter);
        }
        return users_compress.toString();
    }

}
