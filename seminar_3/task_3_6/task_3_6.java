/* Задача 3.6: Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка. */
package seminar_3.task_3_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class task_3_6 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(
                Arrays.asList(2, 4, 2, 3, 5, 8, 7, 9, 0, 1, 3, 4, 6, 8, 777, 888, 999));
        System.out.println(intList);
        int max = max(intList);
        int min = min(intList);
        int maxItem = intList.get(0);
        int minItem = intList.get(0);
        int sumItems = 0;
        for (int item : intList) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / intList.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
