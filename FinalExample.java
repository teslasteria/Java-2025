package javaEducation;

/**
 * FinalExample.java
 *
 * Демонстрация использования модификатора final для классов, методов и переменных.
 *
 * Автор: Константин
 */

 public class FinalExample {

    public static void main(String[] args) {

        System.out.println("=== Инициализация константы через конструктор ===");
        A obj1 = new A(10);
        System.out.println("obj1.a = " + obj1.getA());

        System.out.println("\n=== Инициализация константы при объявлении ===");
        B obj2 = new B();
        System.out.println("B.b = " + B.b);

        System.out.println("\n=== Использование final метода ===");
        C c = new C();
        c.printMessage();

        // Попытка переопределить final метод в подклассе вызовет ошибку компиляции
        // D d = new D();
        // d.printMessage(); // Ошибка: cannot override
    }
}

// === Инициализация final-переменной ===

// Вариант 1: через конструктор
class A {
    public final int a; // неинициализированная константа

    public A(int value) {
        this.a = value; // инициализация в конструкторе
    }

    public int getA() {
        return a;
    }
}

// Вариант 2: при объявлении
class B {
    public final static int b = 100; // инициализация сразу при объявлении
}

// === Final метод ===
class C {
    public final void printMessage() {
        System.out.println("Это финальный метод, его нельзя переопределить");
    }
}

// Подкласс, который не сможет переопределить final метод
// class D extends C {
//     @Override
//     public void printMessage() { } // Ошибка компиляции
// }

// === Final класс ===
final class E {
    // нельзя создать подкласс
}

// class F extends E {} // Ошибка: cannot inherit from final class

