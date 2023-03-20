/*     Задача 4_6: 
В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1
+
2
ответ:
3

+
4
ответ:
7

Отмена
3
*
3

ответ:
9 

Пример 2
Ввод: 1
Ввод: +
Ввод: 2
Вывод: 3
Ввод:+
Ввод:4
Вывод 7
Ввод:*
Ввод:3
Вывод 21
Отмена
Вывод 7
Отмена
Вывод 3
Ввод:-
Ввод:1
Вывод 2

Дополнительно каскадная отмена - отмена нескольких операций*/

package seminar_4.task_4_6;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class task_4_6 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_4_6.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log_2_7.txt");
        // logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);

        logger.info("Введите число: ");
        try (Scanner iScanner = new Scanner(System.in, "UTF-8")) {
            double result = Double.parseDouble(iScanner.nextLine());
            double previousResult = result;
            while (true) {
                final String input = readOperation(logger, iScanner);
                switch (input.trim()) {
                    case "-":
                        previousResult = result;
                        result -= readNumber(logger, iScanner);
                        break;
                    case "+":
                        previousResult = result;
                        result += readNumber(logger, iScanner);
                        break;
                    case "/":
                        previousResult = result;
                        result /= readNumber(logger, iScanner);
                        break;
                    case "*":
                        previousResult = result;
                        result *= readNumber(logger, iScanner);
                        break;
                    case "exit":
                        logger.info("выход");
                        return;
                    case "cancel":
                        result = previousResult;
                        logger.info("отмена");
                    default:
                        logger.info("неизвестная операция");
                }
                logger.info("Результат: " + result);
            }
        }
    }

    private static String readOperation(Logger logger, final Scanner iScanner) {
        logger.info("Введите операцию (+ - / *) или exit или отмена: ");
        final String input = iScanner.nextLine();
        return input;
    }

    private static double readNumber(Logger logger, final Scanner iScanner) {
        logger.info("Введите число: ");
        final double minus = Double.parseDouble(iScanner.nextLine());
        return minus;
    }

}
