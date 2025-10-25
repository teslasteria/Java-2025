package javaEducation;

/**
 * EnumExample.java
 *
 * Демонстрация перечислений с инициализацией элементов.
 *
 * Автор: Константин
 */

// Перечисление с инициализацией значений
enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    // Поле для хранения русскоязычного названия
    private final String displayName;

    // Конструктор перечисления
    Day(String displayName) {
        this.displayName = displayName;
    }

    // Метод для получения значения
    public String getDisplayName() {
        return displayName;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " -> " + day.getDisplayName());
        }
    }
}
