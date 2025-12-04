public class practice12 {
    // Интерфейс с default и static методами
    interface MyInterface {
        // default метод - неабстрактный
        default void defaultMethod() {
            System.out.println("Default method in interface");
        }
        
        // static метод
        static void staticMethod() {
            System.out.println("Static method in interface");
        }
        
        // Обычный абстрактный метод
        void abstractMethod();
    }

    // Класс, реализующий интерфейс
    class MyClass implements MyInterface {
        @Override
        public void abstractMethod() {
            System.out.println("Implemented abstract method");
        }
    }

    // Демонстрация вызовов
    public class Main {
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            
            // 1. Вызов default метода через объект
            obj.defaultMethod();
            
            // 2. Вызов static метода через интерфейс
            MyInterface.staticMethod();
            
            // 3. Вызов реализованного абстрактного метода
            obj.abstractMethod();
        }
    }

    interface InterfaceA {
        default void show() {
            System.out.println("InterfaceA default method");
        }
    }

    interface InterfaceB {
        default void show() {
            System.out.println("InterfaceB default method");
        }
    }

    // ОШИБКА: Duplicate default methods
    // class MyClass implements InterfaceA, InterfaceB { }

    // Решение 1: Переопределение метода
    class Solution1 implements InterfaceA, InterfaceB {
        @Override
        public void show() {
            System.out.println("Overridden in class");
        }
    }

    // Решение 2: Вызов конкретного интерфейсного метода
    class Solution2 implements InterfaceA, InterfaceB {
        @Override
        public void show() {
            // Вызываем метод InterfaceA
            InterfaceA.super.show();
            // Или InterfaceB.super.show();
        }
    }

    // Решение 3: С наследованием интерфейсов
    interface InterfaceC extends InterfaceA {
        // Переопределяем default метод
        @Override
        default void show() {
            System.out.println("InterfaceC overrides InterfaceA");
        }
    }

    // Теперь можно использовать с InterfaceB
    class Solution3 implements InterfaceC, InterfaceB {
        @Override
        public void show() {
            InterfaceC.super.show(); // Вызов из InterfaceC
        }
    }

}
