/**
 * Задача 1.5: Вывести все простые числа от 1 до 1000
 */
package seminar_1.task_1_5;

public class task_1_5 {
    public static void main(String[] args) {

        System.out.print("1");
        for (int cnt = 2; cnt <= 1000; cnt++) {
            boolean isPrime = true;
            for (int i = 2; i < cnt; i++) {
                if ((cnt % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(" " + cnt);
            }
        }
    }
}
