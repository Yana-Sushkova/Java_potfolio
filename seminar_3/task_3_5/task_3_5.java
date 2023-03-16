//Задача 3.5: Пусть дан произвольный список целых чисел, удалить из него чётные числа

package seminar_3.task_3_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_3_5 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(
                Arrays.asList(2, 4, 2, 3, 5, 8, 7, 9, 0, 1, 3, 4, 6, 8, 777, 888, 999));
        System.out.println("Исходный список: " + intList);
        for (int j = intList.size() - 1; j >= 0; j--) { // если идем с конца смещаемся одновременно с удалением и не
                                                        // нужно делать i--
            if ((intList.get(j)) % 2 == 0) {
                intList.remove(j);
            }
        }

        System.out.println("Результирующий список: " + intList);
    }
}
