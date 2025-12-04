import java.io.*;

public class practice18 {
    // practice 1

    class Ex1 extends Exception {}
    class Ex2 extends Ex1 {}
    class Ex3 extends Ex2 {}

    public class ExceptionExamples {
        public static void main(String[] args) {
            // 1. Идентичная обработка разных исключений
            try {
                int choice = 2;
                if (choice == 1) {
                    throw new IOException("Ошибка ввода-вывода");
                } else if (choice == 2) {
                    throw new SQLException("Ошибка базы данных");
                } else {
                    throw new RuntimeException("Общая ошибка");
                }
            } catch (IOException | SQLException e) {
                // Абсолютно идентичная обработка
                System.out.println("Логируем и продолжаем: " + e.getMessage());
            } catch (RuntimeException e) {
                // Другая обработка
                System.out.println("Критическая ошибка: " + e.getMessage());
            }
            
            // 2. Исключения в иерархии
            try {
                throw new Ex3(); // Самый "младший" в иерархии
            } catch (Ex3 e) {
                System.out.println("Поймали Ex3");
            } catch (Ex2 e) {
                System.out.println("Поймали Ex2"); // Не выполнится
            } catch (Ex1 e) {
                System.out.println("Поймали Ex1"); // Не выполнится
            }
            
            // Важно: порядок catch имеет значение!
            try {
                throw new Ex3();
            } catch (Ex1 e) { // Поймает все: Ex1, Ex2, Ex3
                System.out.println("Поймали через родителя Ex1");
            } /* catch (Ex3 e) { // ОШИБКА: unreachable code
                System.out.println("Этот блок никогда не выполнится");
            } */
        }
    }

    // Имитация SQLException для примера
    class SQLException extends Exception {
        public SQLException(String message) {
            super(message);
        }
    }

    // practice 2

    public class FinalCatchExample {
        public static void main(String[] args) {
            try {
                throw new RuntimeException("Тестовое исключение");
            } catch (final Exception e) {
                // 'final' означает, что переменную e нельзя переприсвоить
                // e = new Exception("новое"); // Ошибка компиляции!
                
                System.out.println("Исключение: " + e.getMessage());
                
                // Но можно изменять состояние объекта, на который ссылается e
                // если сам объект это позволяет
            }
        }
    }
}
