/*
 * Задача 1.3: Дан массив nums = [3,2,2,3] и чсило val вводим с клавиатуры.
 * Если в массиве есть числа, равные заданному, нужно перенести
 * эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементы массива должны быть
 * отличны от заданного,
 * а остальные - равны ему.
 * Пример:
 * Ввод: 3
 * Вывод:
 * 2,2,4,3,3,3
 */

package seminar_1.task_1_3;

import java.util.Scanner;
import java.util.Arrays;

/**
 * task_1_3
 */

// Решение 1
/*
 * public class task_1_3 {
 * public static void main(String[] args) {
 * int[] nums = new int[] { 3, 2, 2, 3 };
 * int[] arr = new int[nums.length];
 * int val = 3;
 * int id = 0;
 * for (int i = 0; i < nums.length; i++) {
 * if (val != nums[i]) {
 * arr[id] = nums[i];
 * id++;
 * }
 * }
 * for (int i = id; i < arr.length; i++) {
 * arr[i] = val;
 * }
 * System.out.println(Arrays.toString(arr));
 * // можно было обойтись одним массивом, который перезаписывал бы сам себя
 * // for (int i : arr) {
 * // System.out.print(i + " ");
 * // }
 * }
 * }
 */

// Решение 2
public class task_1_3 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        try (Scanner input = new Scanner(System.in, "Cp866")) {
            System.out.printf("введите число: ");
            int userNum = input.nextInt();
            System.out.println(Arrays.toString(fin_arr(nums, userNum)));
        }
    }

    public static int[] fin_arr(int[] arr, int userNum) {
        int[] form_arr = new int[arr.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == userNum) {
                form_arr[form_arr.length - 1 - k] = arr[i];
                k++;
            } else {
                form_arr[j] = arr[i];
                j++;
            }
        }
        return form_arr;

    }

}
