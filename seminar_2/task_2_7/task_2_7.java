/* Задача 2.7*: Дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4 */

package seminar_2.task_2_7;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class task_2_7 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_2_7.class.getName());
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
            while (true) {
                final String input = readOperation(logger, iScanner);
                switch (input.trim()) {
                    case "-":
                        result -= readNumber(logger, iScanner);
                        break;
                    case "+":
                        result += readNumber(logger, iScanner);
                        break;
                    case "/":
                        result /= readNumber(logger, iScanner);
                        break;
                    case "*":
                        result *= readNumber(logger, iScanner);
                        break;
                    case "exit":
                        logger.info("выход");
                        return;
                    default:
                        logger.info("неизвестная операция");
                }
                logger.info("Результат: " + result);
            }
        }
    }

    private static String readOperation(Logger logger, final Scanner iScanner) {
        logger.info("Введите операцию (+ - / *) или exit: ");
        final String input = iScanner.nextLine();
        return input;
    }

    private static double readNumber(Logger logger, final Scanner iScanner) {
        logger.info("Введите число: ");
        final double minus = Double.parseDouble(iScanner.nextLine());
        return minus;
    }

}
