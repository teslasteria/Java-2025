public class practice11 {
    class Animal {
        void sound() {}
    }
    
    class Dog extends Animal {
        @Override
        void sound() { // ✓ Корректное переопределение
            System.out.println("Гав");
        }
        
        @Override
        void makeSound() { // ✗ Ошибка: такого метода нет в Animal
            System.out.println("Мяу");
        }
    }

    class OldAPI {
        @Deprecated
        void oldMethod() {
            System.out.println("Не используйте этот метод!");
        }
        
        @Deprecated(since = "2.0", forRemoval = true)
        void veryOldMethod() {
            System.out.println("Будет удален в следующей версии");
        }
    }
    
    class Main {
        @SuppressWarnings("unchecked")
        void unsafeMethod() {
            List list = new ArrayList(); // Предупреждение raw types
            list.add("строка");
        }
        
        @SuppressWarnings({"unchecked", "deprecation"})
        void multipleWarnings() {
            OldAPI api = new OldAPI();
            api.oldMethod(); // Предупреждение deprecation
            List list = new ArrayList(); // Предупреждение unchecked
        }
    }
}
