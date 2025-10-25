package javaEducation;

/**
 * StaticExample.java
 *
 * Демонстрация работы статических полей и методов.
 *
 * Автор: Константин
 */

 public class StaticExample {

    public static void main(String[] args) {

        // Вариант 1: вызов через имя класса (рекомендуемый способ)
        System.out.println("Вызов через имя класса:");
        A.printVars();

        // Вариант 2: вызов через экземпляр класса (не рекомендуется, но возможно)
        System.out.println("\nВызов через экземпляр класса:");
        A obj = new A();
        obj.printVars(); // работает, но считается плохой практикой

        // Вариант 3: изменение статических полей через класс и вывод через метод
        System.out.println("\nИзменяем статические поля:");
        A.a = 10;
        A.b = 20;
        A.printVars();

        // Вариант 4: изменение через экземпляр (не рекомендуется)
        System.out.println("\nИзменяем статические поля через экземпляр:");
        obj.a = 100;
        obj.b = 200;
        A.printVars(); // изменения отражаются для всех объектов
    }
}

// Класс с статическими полями и методом
class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
