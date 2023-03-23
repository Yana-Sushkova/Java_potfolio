/*
* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции
1) Добавление номера
2) Вывод всего

Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568
*/

package seminar_5.task_5_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task_5_1 {
    public static void main(final String[] args) throws Exception {
        System.out.println("(1) Добавление номера (2) Вывод всего");
        final Map<String, Set<String>> phoneBook = new HashMap<>();
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            while (true) {
                final String input = readOperation(iScanner);
                switch (input.trim()) {
                    case "1":
                        System.out.println("Введите фамилию");
                        final String name = iScanner.nextLine().trim();

                        System.out.println("Введите номер");
                        final String phone = iScanner.nextLine().trim();

                        Set<String> phones = phoneBook.get(name);
                        if (phones == null) { // добавляем телефон в пустой список
                            final Set<String> newPhones = new HashSet<>();
                            newPhones.add(phone);
                            phones = newPhones;
                        } else {
                            phones.add(phone);
                        }
                        phoneBook.put(name, phones);
                        break;
                    case "2":
                        System.out.println("Вывод всего");
                        for (final Map.Entry<String, Set<String>> people : phoneBook.entrySet()) {
                            System.out.println(people.getKey() + ": " + String.join(", ", people.getValue()));
                        }
                        break;
                    default:
                        System.out.println("неизвестная операция");
                }
            }
        }
    }

    private static String readOperation(final Scanner iScanner) {
        System.out.print("Введите число: ");
        final String input = iScanner.nextLine();
        return input;
    }
}
