public class practice06 {
    class SuperClass {
        protected String field = "Поле суперкласса";
        
        public SuperClass() {
            System.out.println("Конструктор SuperClass()");
        }
        
        public SuperClass(String message) {
            System.out.println("Конструктор SuperClass(String): " + message);
        }
        
        public void show() {
            System.out.println("Метод show() из SuperClass: " + field);
        }
    }
    
    class SubClass extends SuperClass {
        private String field = "Поле подкласса";
        
        // 1. Обращение к конструктору суперкласса
        public SubClass() {
            super(); // Явный вызов конструктора без параметров суперкласса
            System.out.println("Конструктор SubClass()");
        }
        
        public SubClass(String msg) {
            super(msg); // Вызов конструктора с параметром суперкласса
            System.out.println("Конструктор SubClass(String)");
        }
        
        public void display() {
            // 2. Доступ к полю суперкласса
            System.out.println("Поле подкласса: " + this.field);
            System.out.println("Поле суперкласса: " + super.field);
            
            // 3. Доступ к методу суперкласса
            super.show(); // Вызов метода суперкласса
            System.out.println("Метод display() из SubClass");
        }
        
        @Override
        public void show() {
            System.out.println("Переопределенный метод show() в SubClass");
            super.show(); // Вызов метода суперкласса из переопределенного метода
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            System.out.println("=== Создание объектов ===");
            SubClass obj1 = new SubClass();
            obj1.display();
            
            System.out.println("\n=== Создание с параметром ===");
            SubClass obj2 = new SubClass("Тест");
            obj2.show();
        }
    }
}

// Практика 2

//Если a и method() не определены в классе B, но определены в A, то при вызове super.a и super.method() в классе C будут использоваться поле и метод из класса A. Класс B просто передаёт их по цепочке наследования.
//super в данном случае ссылается на ближайшего предка, где есть эти члены класса.

// практика 3

class A {
    int a;
    int b;
    int c;
    int z;
    
    // Конструктор по умолчанию
    public A() {
        this(0, 0, 0); // Вызов конструктора с 3 параметрами
    }
    
    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с 3 параметрами
    }
    
    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с 3 параметрами
    }
    
    // Основной конструктор с тремя параметрами
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // Общая инициализация
    }