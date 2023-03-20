/* Задача 4.3: Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и "запоминает" строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 */

package seminar_4.task_4_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class task_4_3 {
    public static void main(String[] args) throws Exception {
        /*
         * Решение 1
         * Scanner scan_line = new Scanner(System.in, "Cp866");
         * Stack<String> arr_list = new Stack();
         * String text = "";
         * 
         * while (!text.contains("print")) {
         * System.out.println(arr_list);
         * System.out.println("Введите текст: ");
         * text = scan_line.next();
         * if (text.contains("print")) {
         * while (!arr_list.isEmpty()) {
         * System.out.print(arr_list.pop());
         * }
         * 
         * } else {
         * arr_list.push(text);
         * 
         * }
         * 
         * }
         */

        // Решение 2
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String tempIn1 = "";
        Deque<String> list1 = new LinkedList<>(); // работа с очередью
        for (int i = 0;; i++) {
            tempIn1 = reader1.readLine();

            if (tempIn1.equals("print")) {
                while (!list1.isEmpty()) {
                    System.out.println(list1.pollLast());
                }
                break;
            } else {
                list1.add(tempIn1);
            }
        }

    }
}