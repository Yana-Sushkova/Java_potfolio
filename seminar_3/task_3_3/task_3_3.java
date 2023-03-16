/* Задача 3.3: Создать список типа ArrayList<>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа. */
package seminar_3.task_3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task_3_3 {
    public static void main(String[] args) {
        List<Object> mixetList = new ArrayList<>();
        String[] words = new String[] { "я", "люблю", "Java" };
        Random rmd = new Random();
        for (int i = 0; i < 20; i++) {
            int type = rmd.nextInt(0, 2);
            if (type == 0) {
                mixetList.add(rmd.nextInt(1, 10));
            } else {
                mixetList.add(words[rmd.nextInt(words.length)]);

            }
        }
        System.out.println("Решение 1");
        System.out.println(mixetList);

        int length = mixetList.size();
        for (int i = 0; i < length; i++) {
            if (mixetList.get(i) instanceof Integer) {
                mixetList.remove(i);
                length--;
                i--;

            }
        }

        System.out.println(mixetList);
        System.out.println();
        System.out.println("Решение 2");

        // Решение 2
        ArrayList<Object> planetList = new ArrayList<>(
                Arrays.asList(2, "Mercury", 2, 3, "Venus", "Earth", "Earth", "Mars", "Jupiter",
                        "Saturn", 5, "Uranus", "Neptun", 7, "Mercury", "Pluton", "Neptun", 4));
        System.out.println(planetList);
        int i = 0;
        while (i < planetList.size()) {
            if (planetList.get(i) instanceof Integer) {
                planetList.remove(i);
            } else
                i++;
        }
        System.out.println(planetList);
        // решения не надежны, лучше использовать копирование строк в другой массив или
        // итератор

        // Решение 3
        ArrayList<Object> planetList2 = new ArrayList<>(
                Arrays.asList(2, 4, "Mercury", 2, 3, "Venus", "Earth", "Earth", "Mars", "Jupiter",
                        "Saturn", 5, "Uranus", "Neptun", 7, "Mercury", "Pluton", "Neptun", 4));
        System.out.println();
        System.out.println("Решение 3");
        System.out.println(planetList2);
        for (int j = planetList2.size() - 1; j >= 0; j--) { // если идем с конца смещаемся одновременно с удалением и не
                                                            // нужно делать i--
            if (planetList2.get(j) instanceof Integer) {
                planetList2.remove(j);
            }
        }

        System.out.println(planetList2);
    }

}
