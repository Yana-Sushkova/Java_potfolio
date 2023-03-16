/* Задача 3.1: Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран. */
package seminar_3.task_3_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class task_3_1 {
    public static void main(String[] args) {
        Random rdm = new Random(); // генерируемый объект типа Random
        List<Integer> rdm_list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            rdm_list.add(rdm.nextInt(1, 10));

        }
        rdm_list.sort(Comparator.naturalOrder()); // Comparator осуществляет сравнение и выдает результат
        System.out.println(rdm_list);
    }
}
