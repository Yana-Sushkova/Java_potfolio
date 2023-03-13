// Задача 2.5: Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package seminar_2.task_2_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task_2_5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("dataForTask_2_5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder result = parseLine(line);
                System.out.println(result.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder parseLine(String line) {
        StringBuilder result = new StringBuilder();
        String[] parts = line.replaceAll("\"", "").split(",");
        for (String part : parts) {
            String[] kv = part.split(":");
            if (kv[0].equals("фамилия")) {
                result.append("Студент ")
                        .append(kv[1])
                        .append(" ");
            } else if (kv[0].equals("оценка")) {
                result.append("получил ")
                        .append(kv[1])
                        .append(" ");
            } else if (kv[0].equals("предмет")) {
                result.append("по предмету ")
                        .append(kv[1])
                        .append(".");
            }
        }
        return result;
    }
}
