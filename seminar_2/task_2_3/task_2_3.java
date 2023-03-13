// Задача 2.3: записать слово TEST в файл 10 раз
package seminar_2.task_2_3;

import java.io.File;
import java.io.FileWriter;

public class task_2_3 {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";
        String file_name = "test.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false); // false перезаписывает, true дописывает
            for (int index = 0; index < n; index++) {
                writer.write(text);
                writer.write("\n");

            }
            writer.close();
            System.out.println("Получилось");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }

    }
}
