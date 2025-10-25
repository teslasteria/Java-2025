package javaEducation;

/**
 * Пример использования оператора switch в Java.
 * Автор: Константин
 * Тема: Практика с типами, доступными для switch, и поведением при отсутствии break.
 */

 public class SwitchExamples {

    // Перечисление (enum) для примера с switch
    enum Direction { NORTH, SOUTH, EAST, WEST }

    public static void main(String[] args) {

        System.out.println("=== Пример 1: switch с типом int ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Неизвестный день");
        }

        System.out.println("\n=== Пример 2: switch с типом enum ===");
        Direction dir = Direction.EAST;
        switch (dir) {
            case NORTH:
                System.out.println("Север");
                break;
            case SOUTH:
                System.out.println("Юг");
                break;
            case EAST:
                System.out.println("Восток");
                break;
            case WEST:
                System.out.println("Запад");
                break;
        }

        System.out.println("\n=== Пример 3: switch с типом String ===");
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Красный");
                break;
            case "blue":
                System.out.println("Синий");
                break;
            default:
                System.out.println("Неизвестный цвет");
        }

        System.out.println("\n=== Пример 4: switch с типом Integer (класс-оболочка) ===");
        Integer num = 2;
        switch (num) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            default:
                System.out.println("Другое значение");
        }

        System.out.println("\n=== Пример 5: поведение без break ===");
        int a = 2;
        int i = 0;

        switch (a) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;   // выполняется этот блок...
                // ...но так как break отсутствует, программа продолжит выполнение дальше
            case 3:
                i = 3;   // выполняется тоже
                break;
            default:
                i = 0;
        }

        System.out.println("Результат: i = " + i);
        // При a = 2 результат будет 3, потому что case 3 тоже выполняется (нет break после case 2)

    }
}
