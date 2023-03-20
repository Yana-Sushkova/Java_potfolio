/* Задача 4.1: Замерьте время за которое в ArrayList добавится 100000 элементов.
Замерьте время за которое в LinkedList добавится 100000 элементов. Сравните с предыдущим.
 */
package seminar_4.task_4_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_4_1 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList();
        long time_begin = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            // arr.add(i); добавление в конец списка
            arr.add(0, i); // добавление в начало списка

        }
        long time_end = System.currentTimeMillis();
        int result = (int) (time_end - time_begin); // ParseInt строчки переводит к числу, (int) это быстрый перевод к
                                                    // типу данных
        System.out.println("time ArrayList " + result + " ms");

        LinkedList<Integer> list = new LinkedList<>();
        long time_begin2 = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            // list.add(i); добавление в конец списка
            list.add(0, i); // добавление в начало списка
        }
        long time_end2 = System.currentTimeMillis();
        int result2 = (int) (time_end2 - time_begin2);
        System.out.println("time LinkedList " + result2 + " ms");
    }
}
