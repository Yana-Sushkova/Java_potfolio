
/* Задача 1.6: Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа -> */

package seminar_1.task_1_6;

import java.util.Scanner;

public class task_1_6 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        try (Scanner iScanner = new Scanner(System.in, "UTF-8")) {
            double result = Double.parseDouble(iScanner.nextLine());
            while (true) {
                final String input = readOperation(iScanner);
                switch (input.trim()) {
                    case "-":
                        result -= readNumber(iScanner);
                        break;
                    case "+":
                        result += readNumber(iScanner);
                        break;
                    case "/":
                        result /= readNumber(iScanner);
                        break;
                    case "*":
                        result *= readNumber(iScanner);
                        break;
                    case "exit":
                        System.out.println("выход");
                        return;
                    default:
                        System.out.println("неизвестная операция");
                }
                System.out.println("результат: " + result);
            }
        }
    }

    private static String readOperation(final Scanner iScanner) {
        System.out.print("Введите операцию (+ - / *) или exit: ");
        final String input = iScanner.nextLine();
        return input;
    }

    private static double readNumber(final Scanner iScanner) {
        System.out.print("Введите число: ");
        final double minus = Double.parseDouble(iScanner.nextLine());
        return minus;
    }

}
