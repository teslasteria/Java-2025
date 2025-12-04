public class practice17 {
    public class ExceptionHandling {
    
        public static void main(String[] args) {
            try {
                method1(); // Исключение будет перехвачено
            } catch (ArithmeticException e) {
                System.out.println("Перехвачено в main: " + e.getMessage());
            }
            
            // Второй вызов приведет к аварийной остановке
            method2();
        }
        
        static void method1() {
            try {
                // Это исключение будет перехвачено локально
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Перехвачено в method1: " + e.getMessage());
                // Можно продолжить выполнение
            }
            System.out.println("method1 завершился нормально");
        }
        
        static void method2() {
            // NullPointerException НЕ перехватывается в этом методе
            String str = null;
            System.out.println(str.length()); // NullPointerException!
            
            // Этот код никогда не выполнится
            System.out.println("Это сообщение не появится");
        }
    }
}
