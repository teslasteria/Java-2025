public class practice07 {
    // практика 1
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
        
        double add(double a, double b) {
            return a + b;
        }
        
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    
    class Animal {
        void sound() {
            System.out.println("Животное издает звук");
        }
    }
    
    // практика 2
    class Dog extends Animal {
        @Override
        void sound() { // Переопределение
            System.out.println("Гав-гав!");
        }
    }

    // практика 3
    class Parent {
        void show() {}
    }
    
    class Child extends Parent {
        @Override
        void shwo() { // Ошибка: method does not override
            // Без @Override компилировалось бы нормально
            // С @Override - ошибка: опечатка в имени метода
        }
    }
}
