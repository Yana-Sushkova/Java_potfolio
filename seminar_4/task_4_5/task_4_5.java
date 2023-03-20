/* Задача 4.5: Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

package seminar_4.task_4_5;

import java.util.Arrays;

public class task_4_5 {
    public static void main(String[] args) {
        function_task_4_5 outputs = new function_task_4_5(15);
        outputs.enqueue(1);
        outputs.enqueue(2);
        outputs.enqueue(3);
        System.out.println(Arrays.toString(outputs.get()));
        System.out.println("Показать первый элемент " + outputs.first());
        System.out.println(Arrays.toString(outputs.get()));
        System.out.println("Удалить и показать первый элемент " + outputs.dequeue());
        System.out.println(Arrays.toString(outputs.get()));
        System.out.println("Удалить и показать первый элемент " + outputs.dequeue());
        System.out.println(Arrays.toString(outputs.get()));
        System.out.println("Удалить и показать первый элемент " + outputs.dequeue());
        outputs.dequeue();
        System.out.println(Arrays.toString(outputs.get()));
    }
}
