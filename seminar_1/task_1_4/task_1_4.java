/* Задача 1.4: Вычислить n-ое треугольного число(сумма чисел от 1 до n), а 
так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */

package seminar_1.task_1_4;

import java.util.Scanner;

public class task_1_4 {
    public static void main(String[] args) {
        int n = readTerminalValue();
        sum1ToN(n);
        factorial1ToN(n);
    }

    // получение данных из терминала
    private static int readTerminalValue() {
        try (Scanner iScanner = new Scanner(System.in, "UTF-8")) {
            System.out.printf("Ввод: ");
            return Integer.parseInt(iScanner.nextLine());
        }
    }

    // сумма чисел от 1 до n
    private static void sum1ToN(final int n) {
        System.out.print("Треугольное число: 1");
        int sum = 1; // сразу устанавливаем минимальную сумму (равна 1), позволит считать с 2
        for (int cnt = 2; cnt <= n; cnt++) {
            sum += cnt;
            System.out.print(" + " + cnt);
        }
        System.out.println(" = " + sum);
    }

    // произведение чисел от 1 до n
    private static void factorial1ToN(final int n) {

        System.out.print("n!: 1");
        int sum = 1; // сразу устанавливаем минимальную сумму (равна 1), позволит считать с 2
        for (int cnt = 2; cnt <= n; cnt++) {
            sum *= cnt;
            System.out.print(" * " + cnt);
        }
        System.out.println(" = " + sum);
    }

}