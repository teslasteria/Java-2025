package javaEducation;

/**
 * MethodOverloadingOverriding.java
 *
 * Демонстрация перегрузки (overloading) и переопределения (overriding) методов.
 *
 * Автор: Константин
 */

// Суперкласс
class Animal {

    // Метод без аргументов
    public void speak() {
        System.out.println("Животное издает звук");
    }

    // Метод с аргументом (перегрузка внутри класса)
    public void speak(String sound) {
        System.out.println("Животное говорит: " + sound);
    }
}

// Подкласс
class Dog extends Animal {

    // Переопределение метода speak()
    @Override
    public void speak() {
        System.out.println("Собака лает: Гав!");
    }

    // Перегрузка метода speak() с другим количеством аргументов
    public void speak(String sound, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Собака: " + sound);
        }
    }
}

public class MethodOverloadingOverriding {
    public static void main(String[] args) {

        System.out.println("=== Перегрузка методов ===");
        Animal a = new Animal();
        a.speak();                  // Метод без аргументов
        a.speak("Мяу");             // Метод с аргументом

        System.out.println("\n=== Переопределение методов ===");
        Dog dog = new Dog();
        dog.speak();                // Переопределенный метод суперкласса
        dog.speak("Гав-гав", 3);    // Перегруженный метод с двумя аргументами

        System.out.println("\n=== Вызов переопределенного метода через ссылку на суперкласс ===");
        Animal pet = new Dog();
        pet.speak();                // Вызовется метод подкласса (override)
        pet.speak("Ррр");           // Вызовется перегруженный метод суперкласса
    }
}
