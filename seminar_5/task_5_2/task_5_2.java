/*
    Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */
package seminar_5.task_5_2;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_5_2 {
    private static String[] FULL_NAMES = new String[] {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
    };

    public static void main(final String[] args) throws Exception {
        final Map<String, Integer> names = new HashMap<>();
        for (final String fullName : FULL_NAMES) {
            final String name = fullName.split(" ")[0];
            Integer count = names.get(name);
            if (count == null) { // добавляем телефон в пустой список
                count = 1;
            } else {
                count++;
            }
            names.put(name, count);
        }

        final List<Map.Entry<String, Integer>> list = new ArrayList<>(names.entrySet());
        list.sort(new Comparator<>() {
            @Override
            public int compare(final Map.Entry<String, Integer> arg0,
                    final Map.Entry<String, Integer> arg1) {
                return arg1.getValue() - arg0.getValue();
            }
        });

        for (final Map.Entry<String, Integer> item : list) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}
