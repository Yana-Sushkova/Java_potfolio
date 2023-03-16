/* Задача 3.2: Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке. */
package seminar_3.task_3_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class task_3_2 {
    public static void main(String[] args) {
        // Решение 1

        /*
         * String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
         * "Saturn", "Uranus", "Neptun", "Pluton" };
         * List<String> planetList = new ArrayList<String>();
         * Random random = new Random();
         * for (int i = 0; i <= 20; i++) {
         * int index = random.nextInt(planets.length);
         * planetList.add(planets[index]);
         * }
         * System.out.println(planetList);
         * for (int i = 0; i < planets.length; i++) {
         * System.out.printf("%s встречается %d раз(a) \n", planets[i],
         * Collections.frequency(planetList, planets[i]));
         * }
         */
        // Решение 2
        /*
         * String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
         * "Saturn", "Uranus", "Neptun", "Pluton" };
         * List<String> planetList = new ArrayList<String>();
         * Random random = new Random();
         * for (int i = 0; i <= 10; i++) {
         * int index = random.nextInt(planets.length);
         * planetList.add(planets[index]);
         * }
         * System.out.println(planetList);
         * int[] count = new int[planets.length];
         * for (String name : planetList) {
         * for (int j = 0; j < planets.length; j++) {
         * if (name.equals(planets[j])) {
         * count[j]++;
         * break;
         * }
         * }
         * }
         * for (int j = 0; j < planets.length; j++) {
         * System.out.println(planets[j] + ":" + count[j]);
         * }
         */
        // Решение 3
        /*
         * String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
         * "Saturn", "Uranus", "Neptun", "Pluton" };
         * List<String> planetList = new ArrayList<String>();
         * Random random = new Random();
         * for (int i = 0; i <= 20; i++) {
         * int index = random.nextInt(planets.length);
         * planetList.add(planets[index]);
         * }
         * System.out.println(planetList);
         * Map<String, Integer> planetCounts = new HashMap<>();
         * for (String planet : planetList) {
         * Integer count = planetCounts.get(planet);
         * if (count == null) {
         * planetCounts.put(planet, 1);
         * } else {
         * planetCounts.put(planet, count + 1);
         * }
         * }
         * for (String planet : planetCounts.keySet()) {
         * Integer count = planetCounts.get(planet);
         * Syst }em.out.println(planet + ": " + count);
         * }
         */
        // Решение 4
        ArrayList<String> planetList = new ArrayList<String>(
                Arrays.asList("Mercury", "Venus", "Earth", "Earth", "Mars", "Jupiter",
                        "Saturn", "Uranus", "Neptun", "Mercury", "Pluton", "Neptun"));
        planetList.sort(Comparator.naturalOrder());
        int count = 1;

        for (int i = planetList.size() - 1; i > 0; i--) {
            if (planetList.get(i).equals(planetList.get(i - 1))) {
                count++;
            } else {
                System.out.println(planetList.get(i) + " повторяется " + count + " раз(а) ");
                count = 1;
            }
        }
        System.out.println(planetList.get(0) + " повторяется " + count + " раз(а)");
    }
}