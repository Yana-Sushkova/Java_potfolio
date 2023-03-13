/* Задача 2.6: Напишите метод, который принимает на вход строку (String) и 
определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций
 */
package seminar_2.task_2_6;

public class task_2_6 {
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Яна    А н я   "));
    }
}
