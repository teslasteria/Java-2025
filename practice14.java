public class practice14 {
    // practice 1

    public class BufferBuilderMethods {
        public static void main(String[] args) {
            // 1. append() - добавление в конец
            StringBuilder sb1 = new StringBuilder("Hello");
            sb1.append(" World");
            System.out.println("append: " + sb1); // Hello World
            
            // 2. insert() - вставка по индексу
            sb1.insert(5, ",");
            System.out.println("insert: " + sb1); // Hello, World
            
            // 3. delete() - удаление части
            sb1.delete(5, 7);
            System.out.println("delete: " + sb1); // Hello World
            
            // 4. deleteCharAt() - удаление символа
            sb1.deleteCharAt(5);
            System.out.println("deleteCharAt: " + sb1); // HelloWorld
            
            // 5. reverse() - обратный порядок
            sb1.reverse();
            System.out.println("reverse: " + sb1); // dlroWolleH
            
            // 6. replace() - замена части
            sb1.reverse(); // Возвращаем обратно
            sb1.replace(5, 10, " Java");
            System.out.println("replace: " + sb1); // Hello Java
            
            // 7. substring() - получение подстроки
            String sub = sb1.substring(6);
            System.out.println("substring: " + sub); // Java
            
            // 8. setCharAt() - замена символа
            sb1.setCharAt(0, 'h');
            System.out.println("setCharAt: " + sb1); // hello Java
            
            // 9. capacity() / ensureCapacity() - управление емкостью
            StringBuilder sb2 = new StringBuilder();
            System.out.println("capacity: " + sb2.capacity()); // 16
            sb2.ensureCapacity(100);
            System.out.println("after ensureCapacity: " + sb2.capacity()); // 100
            
            // 10. setLength() - установка длины
            sb1.setLength(5);
            System.out.println("setLength: " + sb1); // hello
        }
    }

    // practice 2

    public class StringConversions {
        public static void main(String[] args) {
            String str = "Hello";
            StringBuilder sb = new StringBuilder();
            StringBuffer buffer = new StringBuffer();
            
            // 1. String → StringBuilder
            sb = new StringBuilder(str); // Конструктор
            sb.append(" World");
            
            // 2. String → StringBuffer  
            buffer = new StringBuffer(str); // Конструктор
            buffer.append(" Buffer");
            
            // 3. StringBuilder → String
            String fromSB = sb.toString(); // метод toString()
            System.out.println("StringBuilder → String: " + fromSB);
            
            // 4. StringBuffer → String
            String fromBuffer = buffer.toString(); // метод toString()
            System.out.println("StringBuffer → String: " + fromBuffer);
            
            // 5. StringBuilder ↔ StringBuffer (через String)
            // Непрямое преобразование
            StringBuffer buffer2 = new StringBuffer(sb.toString());
            StringBuilder sb2 = new StringBuilder(buffer.toString());
            
            System.out.println("\nСравнение производительности:");
            
            // 6. Примеры использования
            // Собираем строку из частей
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                result.append("item").append(i);
                if (i < 4) result.append(", ");
            }
            String finalString = result.toString();
            System.out.println("Собранная строка: " + finalString);
            
            // 7. StringBuffer для многопоточности
            StringBuffer threadSafeBuffer = new StringBuffer("Start");
            Runnable task = () -> {
                threadSafeBuffer.append("|thread");
            };
            
            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            t1.start();
            t2.start();
            
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("StringBuffer после потоков: " + threadSafeBuffer);
            
            // 8. Быстрое преобразование char array
            char[] chars = {'J', 'a', 'v', 'a'};
            String fromChars = new String(chars);
            StringBuilder sbFromChars = new StringBuilder().append(chars);
            
            System.out.println("Из char[]: " + fromChars + ", " + sbFromChars);
        }
    }
}
