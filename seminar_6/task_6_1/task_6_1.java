package seminar_6.task_6_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий фильтрации
 * и выведет ноутбуки,
 * отвечающие фильтру.
 * 
 * NoteBook notebook1 = new NoteBook
 * NoteBook notebook2 = new NoteBook
 * NoteBook notebook3 = new NoteBook
 * NoteBook notebook4 = new NoteBook
 * NoteBook notebook5 = new NoteBook
 * 
 * Например: “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет
 * 
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * 
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 * 
 * Класс сделать в отдельном файле
 * 
 * приветствие
 * Выбор параметра
 * выбор конкретнее
 * вывод подходящих
 */
public class task_6_1 {

    public static void main(final String[] args) throws Exception {
        final Set<NoteBook> notebooks = Set.of(
                new NoteBook(NoteBook.OZU.OZU_4GB, NoteBook.Hard.HARD_1024GB, NoteBook.OS.LINUX, NoteBook.Color.BLACK),
                new NoteBook(NoteBook.OZU.OZU_4GB, NoteBook.Hard.HARD_128GB, NoteBook.OS.MAC, NoteBook.Color.RED),
                new NoteBook(NoteBook.OZU.OZU_8GB, NoteBook.Hard.HARD_1024GB, NoteBook.OS.WINDOWS,
                        NoteBook.Color.SILVER),
                new NoteBook(NoteBook.OZU.OZU_16GB, NoteBook.Hard.HARD_512GB, NoteBook.OS.WINDOWS,
                        NoteBook.Color.BLUE),
                new NoteBook(NoteBook.OZU.OZU_32GB, NoteBook.Hard.HARD_256GB, NoteBook.OS.LINUX,
                        NoteBook.Color.WHITE)

        );

        final Map<String, Enum<?>> filter = new HashMap<>();
        try (Scanner iScanner = new Scanner(System.in, "Cp866")) {
            while (true) {
                printChoiceCommon();
                final String input = iScanner.nextLine();
                switch (input.trim()) {
                    case "1":
                        printChoiceFilterParam(NoteBook.OZU.values());
                        filter.put("ozu", readFilterParam(iScanner, NoteBook.OZU.values()));
                        break;
                    case "2":
                        printChoiceFilterParam(NoteBook.Hard.values());
                        filter.put("hard", readFilterParam(iScanner, NoteBook.Hard.values()));
                        break;
                    case "3":
                        printChoiceFilterParam(NoteBook.OS.values());
                        filter.put("os", readFilterParam(iScanner, NoteBook.OS.values()));
                        break;
                    case "4":
                        printChoiceFilterParam(NoteBook.Color.values());
                        filter.put("color", readFilterParam(iScanner, NoteBook.Color.values()));
                        break;
                    case "exit":
                        System.out.println("выход");
                        return;
                    default:
                        System.out.println("неизвестная операция");
                }

                lookUp(notebooks, filter);

                // System.out.println("результат: " + result);
            }
        }
    }

    private static void lookUp(final Set<NoteBook> notebooks, final Map<String, Enum<?>> filter) {
        boolean exist = false;
        for (final NoteBook note : notebooks) {
            if (checkNotebook(note, filter)) {
                if (!exist) {
                    exist = true;
                    System.out.println("вам подходит:");
                }
                System.out.println(note);
            }
        }
        if (!exist) {
            System.out.println("мы не нашли подходящую вам конфигурацию");
        }
        System.out.println();
    }

    private static boolean checkNotebook(final NoteBook note, final Map<String, Enum<?>> filter) {
        boolean exist = true;
        for (final Entry<String, Enum<?>> param : filter.entrySet()) {
            switch (param.getKey()) {
                case "ozu":
                    exist &= note.getMemoryOZU() == param.getValue();
                    break;
                case "hard":
                    exist &= note.getMemoryHardDisc() == param.getValue();
                    break;
                case "os":
                    exist &= note.getOs() == param.getValue();
                    break;
                case "color":
                    exist &= note.getColor() == param.getValue();
                    break;
                default:
                    throw new IllegalArgumentException("не известное значение фильтра " + param.getKey());
            }
        }
        return exist;
    }

    private static Enum<?> readFilterParam(final Scanner iScanner, final Enum<?>[] values) {
        while (true) {
            final int index = readNumber(iScanner);
            if (index > values.length || index < 1) {
                System.out.println("неизвестная операция");
            } else {
                return values[index - 1];
            }
        }
    }

    private static void printChoiceFilterParam(final Enum<?>[] values) {
        System.out.println("Уточните выбор:");
        for (final Enum<?> value : values) {
            System.out.println((value.ordinal() + 1) + " - " + value.name());
        }
    }

    private static void printChoiceCommon() {
        System.out.println("Введите цифру, соответствующую необходимому критерию: (или exit для выхода)");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
    }

    private static int readNumber(final Scanner iScanner) {
        System.out.print("Введите число: ");
        return Integer.parseInt(iScanner.nextLine());
    }
}
