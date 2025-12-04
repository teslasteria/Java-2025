import java.io.*;

public class practice20 {

    // practice 1

    public class InputStreamExample {
        public static void main(String[] args) throws IOException {
            byte[] data = {65, 66, 67, 68, 69}; // A, B, C, D, E
            
            try (ByteArrayInputStream bis = new ByteArrayInputStream(data)) {
                int byteRead;
                System.out.print("Прочитано: ");
                
                // read() возвращает -1 при конце потока
                while ((byteRead = bis.read()) != -1) {
                    System.out.print((char) byteRead + "(" + byteRead + ") ");
                }
            }
            // Вывод: Прочитано: A(65) B(66) C(67) D(68) E(69)
        }
    }

    // practice 2

    public class OutputStreamExample {
        public static void main(String[] args) throws IOException {
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                // write(int) записывает младший байт числа (0-255)
                bos.write(72);  // H
                bos.write(101); // e
                bos.write(108); // l
                bos.write(108); // l
                bos.write(111); // o
                
                byte[] result = bos.toByteArray();
                System.out.println(new String(result)); // Hello
            }
        }
    }

    //practice 3

    /*
    Reader/Writer работают с символами (char), а InputStream/OutputStream с байтами
    */

    //practice 4

    // Без AutoCloseable
    // Connection conn = null;
    // try {
    //     conn = new Connection();
    //     // работа с ресурсом
    // } finally {
    //     if (conn != null) {
    //         try {
    //             conn.close(); // Ручное закрытие
    //         } catch (Exception e) {
    //             // игнорируем
    //         }
    //     }
    // }

    // С AutoCloseable (try-with-resources)
    class MyResource implements AutoCloseable {
        void use() { System.out.println("Используем ресурс"); }
        
        @Override
        public void close() {
            System.out.println("Ресурс автоматически закрыт");
        }
    }

    public class AutoCloseableExample {
        public static void main(String[] args) {
            // Автоматически вызывает close() после блока try
            try (MyResource res = new MyResource()) {
                res.use();
            } // Здесь автоматически res.close()
            
            // Можно несколько ресурсов
            try (var in = new FileInputStream("in.txt");
                var out = new FileOutputStream("out.txt")) {
                // работа
            } // Закрываются в обратном порядке
        }
    }
}
