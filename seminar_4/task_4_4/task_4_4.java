/* Задача 4.4: Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список. */
package seminar_4.task_4_4;

import java.util.LinkedList;

public class task_4_4 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // заполняем список случайными числами
        for (int i = 0; i < 10; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);

        // выводим “перевернутый” список
        System.out.println(ReturnReversList(ll));

    }

    private static LinkedList<Integer> ReturnReversList(LinkedList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            int tmp = list.get(i);
            list.remove(i);
            list.add(tmp);
        }
        return list;

    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;
    }
}
