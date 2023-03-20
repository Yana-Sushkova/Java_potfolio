/* Задача 4.5: Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

package seminar_4.task_4_5;

public class function_task_4_5 {

    int[] arr;
    int size = 0;
    int index_end = 0;
    int index_start = 0;

    public function_task_4_5() {
        arr = new int[10];
    }

    public function_task_4_5(int size) {
        arr = new int[size];
    }

    public void enqueue(int item) {
        arr[index_end++] = item;
        size++;
        if (size > arr.length - 2) {
            rebuildArr();
        }
    }

    private void rebuildArr() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int dequeue() {
        int temp = arr[index_start];
        arr[index_start] = 0;
        index_start++;
        return temp;

    }

    public int first() {

        return arr[index_start];
    }

    public int[] get() {
        return arr;
    }
}
