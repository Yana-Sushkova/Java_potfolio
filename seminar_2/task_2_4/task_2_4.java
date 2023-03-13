/* Задача 2.4: Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл. */
package seminar_2.task_2_4;

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class task_2_4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_2_4.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log_2_4.txt");
        // logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        int[] nums = new int[] { 1, 4, 3, 2, 6, 8, 5, 9 };
        logger.info("Запуск алгоритма для массива " + Arrays.toString(nums));

        for (int out = nums.length - 1; out >= 1; out--) { // Внешний цикл
            for (int in = 0; in < out; in++) { // Внутренний цикл
                if (nums[in] > nums[in + 1]) { // Если порядок элементов нарушен
                    int dummy = nums[in]; // во временную переменную помещаем первый элемент
                    nums[in] = nums[in + 1]; // на место первого ставим второй элемент
                    nums[in + 1] = dummy; // вместо второго элемента пишем первый из временной памяти
                    logger.info("Поменяли местами элемент  " + in + " с элементом " + (in + 1));
                }
            }
        }
        logger.info("Результат работы алгоритма " + Arrays.toString(nums));
    }
}

// каждую итерацию записать в лог или в логер или в файл