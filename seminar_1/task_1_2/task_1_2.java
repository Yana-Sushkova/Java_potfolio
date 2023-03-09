/* Задача 1.2: Дан массив двоичных чисел, например [1,1,0,1,1,1,0,1,1,1,1], 
вывести максимальное количество подряд идущих 1.
Вывод: 4. */

package seminar_1.task_1_2;

// Решение 1
//import java.util.Arrays;
/*
 * public class task_1_2 {
 * public static void main(String[] args) {
 * int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
 * int count = 0;
 * int count_max = 0;
 * for (int index : arr) {
 * if (index == 1) {
 * count++;
 * } else {
 * if (count > count_max) {
 * count_max = count;
 * }
 * count = 0;
 * }
 * }
 * if (count > count_max) {
 * count_max = count;
 * }
 * System.out.println(Arrays.toString(arr));
 * System.out.println("Максимальное количество подряд идущих единиц: " +
 * count_max);
 * }
 * }
 */

/*
 * // Решение 2
 * public class task_1_2 {
 * public static void main(String[] args) {
 * int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
 * System.out.printf("Максимальная последовательность = %d", calc(arr));
 * }
 * 
 * public static int calc(int[] arr) {
 * int count = 0;
 * int count_temp = 0;
 * for (int i = 0; i < arr.length; i++) {
 * if (arr[i] == 1) {
 * count_temp++;
 * }
 * if (count_temp > count) {
 * count = count_temp;
 * }
 * if (arr[i] == 0) {
 * count_temp = 0;
 * }
 * }
 * return count_temp;
 * }
 * 
 * }
 */

// Решение 3 (будет работать быстрее, т.к. нет лишней проверки, еще одного if)
import java.util.Arrays;

public class task_1_2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        int count = 0;
        int count_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > count_max) {
                    count_max = count;
                }
                count = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (count < count_max) {
            System.out.println(count_max);
        } else {
            System.out.println(count);
        }
    }
}