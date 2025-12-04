public class practice16 {
    //practice 1
    /*
        Throwable - базовый класс всех исключений и ошибок

    Error - серьёзные системные ошибки (OutOfMemoryError, StackOverflowError). Обычно не обрабатываются.

    Exception - проверяемые исключения (IOException, SQLException). Должны быть обработаны.

    RuntimeException - непроверяемые исключения (NullPointerException, ArrayIndexOutOfBounds). Можно не обрабатывать. */

    //practice 2

    public class ExceptionExamples {
        public static void main(String[] args) {
            // 1. ArithmeticException - деление на ноль
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
            
            // 2. ArrayIndexOutOfBoundsException - выход за границы массива
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            
            // 3. IllegalArgumentException - неверный аргумент
            try {
                setAge(-5);
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            }
            
            // 4. ClassCastException - неверное приведение типа
            try {
                Object obj = "строка";
                Integer num = (Integer) obj;
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: " + e.getMessage());
            }
            
            // 5. NullPointerException - обращение к null
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            }
            
            // 6. Пример с несколькими исключениями
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[2] / 0);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getClass().getSimpleName());
            } finally {
                System.out.println("Блок finally выполнен всегда");
            }
        }
        
        static void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным");
            }
        }
    }
}
