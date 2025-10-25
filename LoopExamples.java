package javaEducation;

/**
 * Примеры работы с циклами в Java.
 * Автор: Константин
 * Тема: while, do-while, for, for-each, break и continue.
 */

 public class LoopExamples {
    public static void main(String[] args) {

        System.out.println("\n=== Практика #1: бесконечные циклы ===");

        // Пример бесконечного while (остановлен break'ом)
        int counter = 0;
        while (true) {
            System.out.println("Цикл while: итерация " + counter);
            counter++;
            if (counter >= 3) {
                break; // Выход из бесконечного цикла
            }
        }

        // Пример бесконечного do-while
        int count = 0;
        do {
            System.out.println("Цикл do-while: итерация " + count);
            count++;
            if (count >= 3) {
                break; // Выход из бесконечного цикла
            }
        } while (true);

        System.out.println("\n=== Практика #2: использование break и continue ===");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Пропускаем число 5 (continue)");
                continue; // Пропускает итерацию для i == 5
            }
            if (i == 8) {
                System.out.println("Останавливаем цикл при i == 8 (break)");
                break; // Полностью выходит из цикла
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== Пример 6: бесконечный цикл for ===");
        int infiniteCounter = 0;
        for (;;) { // бесконечный цикл for
            System.out.println("Итерация #" + infiniteCounter);
            infiniteCounter++;
            if (infiniteCounter >= 3) {
                break; // предотвращаем вечное выполнение
            }
        }

        System.out.println("\nКонец программы");
    }
}
