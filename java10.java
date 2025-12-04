public class java10 {
    // Интерфейс с вложенным статическим классом
interface MyInterface {
    void interfaceMethod();
    
    // Вложенный статический класс внутри интерфейса
    static class NestedClass {
        public void nestedMethod() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
    }
}

// Использование
public class Main {
    public static void main(String[] args) {
        // Создание объекта вложенного класса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        
        // Вызов метода вложенного класса
        nested.nestedMethod(); // Вывод: Метод вложенного класса в интерфейсе
    }
}
}
