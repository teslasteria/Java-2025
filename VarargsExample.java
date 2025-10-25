package javaEducation;

/**
 * VarargsExample.java
 *
 * Демонстрация перегрузки метода с переменным числом параметров (varargs)
 *
 * Автор: Константин
 */

 public class VarargsExample {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Вызов метода с разным числом аргументов
        System.out.println("Сумма двух чисел: " + calc.sum(1, 2));
        System.out.println("Сумма трёх чисел: " + calc.sum(1, 2, 3));
        System.out.println("Сумма массива чисел: " + calc.sum(1, 2, 3, 4, 5));

        // Вызов перегруженного метода
        System.out.println("Произведение чисел: " + calc.multiply(2, 3));
        System.out.println("Произведение чисел (varargs): " + calc.multiply(2, 3, 4, 5));
    }
}

// Класс с перегруженными методами и varargs
class Calculator {

    // Перегрузка метода sum с двумя аргументами
    public int sum(int a, int b) {
        return a + b;
    }

    // Метод с переменным числом параметров (varargs)
    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // Перегрузка метода multiply с двумя аргументами
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод с переменным числом параметров (varargs)
    public int multiply(int... numbers) {
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        return result;
    }
}
