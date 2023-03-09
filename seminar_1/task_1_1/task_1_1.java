
/*
 * Задача 1.1: Написать программу, которая запросит пользователя ввести <Имя> в
 * консоли.
 * Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
 */
package seminar_1.task_1_1;

import java.util.Scanner;

/**
 * task_1
 */
public class task_1_1 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            System.out.printf("name: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s! ", name);
        }
    }
}