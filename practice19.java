public class practice19 {
    // Собственное проверяемое исключение
class MyFirstException extends Exception {
    
    // 1. Конструктор по умолчанию
    public MyFirstException() {
        super("Мое первое исключение");
    }
    
    // 2. Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }
    
    // 3. Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
    
    // 4. Конструктор только с причиной
    public MyFirstException(Throwable cause) {
        super(cause);
    }
}

// Собственное непроверяемое исключение
class MyRuntimeException extends RuntimeException {
    // Аналогичные конструкторы
    public MyRuntimeException() {
        super("Мое runtime исключение");
    }
    
    public MyRuntimeException(String message) {
        super(message);
    }
    
    public MyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Пример использования
public class CustomExceptionExample {
    
    static void validateAge(int age) throws MyFirstException {
        if (age < 0) {
            throw new MyFirstException("Возраст не может быть отрицательным: " + age);
        }
        if (age > 150) {
            throw new MyFirstException("Слишком большой возраст: " + age);
        }
        System.out.println("Возраст корректен: " + age);
    }
    
    static void processData(String data) {
        if (data == null || data.isEmpty()) {
            throw new MyRuntimeException("Некорректные данные");
        }
        System.out.println("Обработка: " + data);
    }
    
    public static void main(String[] args) {
        try {
            validateAge(25);      // Корректно
            validateAge(-5);      // Бросит MyFirstException
        } catch (MyFirstException e) {
            System.out.println("Поймано: " + e.getMessage());
            e.printStackTrace();
        }
        
        try {
            processData("текст"); // Корректно
            processData("");      // Бросит MyRuntimeException
        } catch (MyRuntimeException e) {
            System.out.println("Runtime исключение: " + e.getMessage());
        }
    }
}
}
