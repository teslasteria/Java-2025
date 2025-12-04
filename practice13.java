import java.util.StringJoiner;

public class practice13 {
    // practice 1

    public class StringMethods {
        public static void main(String[] args) {
            String str = "  Hello, World!  ";
            String other = "HELLO";
            
            // 1. length() - длина строки
            System.out.println("Длина: " + str.length()); // 17
            
            // 2. trim() - удаляет пробелы по краям
            System.out.println("Trim: '" + str.trim() + "'"); // "Hello, World!"
            
            // 3. toUpperCase() / toLowerCase() - регистр
            System.out.println("Upper: " + str.toUpperCase());
            System.out.println("Lower: " + str.toLowerCase());
            
            // 4. substring() - часть строки
            System.out.println("Substring: " + str.substring(2, 9)); // "Hello,"
            
            // 5. replace() - замена символов
            System.out.println("Replace: " + str.replace('o', '0')); // "Hell0, W0rld!"
            
            // 6. split() - разделение на массив
            String[] parts = "a,b,c".split(",");
            System.out.println("Split: " + Arrays.toString(parts)); // [a, b, c]
            
            // 7. equals() / equalsIgnoreCase() - сравнение
            System.out.println("Equals: " + str.equals(other)); // false
            System.out.println("EqualsIgnoreCase: " + str.trim().equalsIgnoreCase("hello, world!")); // true
            
            // 8. contains() - проверка подстроки
            System.out.println("Contains 'World': " + str.contains("World")); // true
            
            // 9. indexOf() / lastIndexOf() - поиск индекса
            System.out.println("Index of 'o': " + str.indexOf('o')); // 4
            System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // 8
            
            // 10. startsWith() / endsWith() - проверка начала/конца
            System.out.println("Starts with 'He': " + str.startsWith("He")); // true
            System.out.println("Ends with '!  ': " + str.endsWith("!  ")); // true
        }
    }

    //practice 2

    public class StringJoinerExample {
        public static void main(String[] args) {
            // Простой StringJoiner
            StringJoiner sj1 = new StringJoiner(", ");
            sj1.add("Java").add("Python").add("C++");
            System.out.println(sj1); // Java, Python, C++
            
            // С префиксом и суффиксом
            StringJoiner sj2 = new StringJoiner(", ", "[", "]");
            sj2.add("Apple").add("Banana").add("Orange");
            System.out.println(sj2); // [Apple, Banana, Orange]
            
            // Объединение двух StringJoiner
            StringJoiner sj3 = new StringJoiner("; ");
            sj3.add("Red").add("Green");
            sj2.merge(sj3);
            System.out.println(sj2); // [Apple, Banana, Orange, Red; Green]
            
            // Использование в Stream API
            StringJoiner sj4 = new StringJoiner(" | ");
            for (int i = 1; i <= 3; i++) {
                sj4.add("Item " + i);
            }
            System.out.println(sj4); // Item 1 | Item 2 | Item 3
        }
    }

    //practice 3

    public class TextBlocks {
        public static void main(String[] args) {
            // До Java 13 - многострочный текст был неудобен
            String oldWay = "{\n" +
                            "  \"name\": \"John\",\n" +
                            "  \"age\": 30,\n" +
                            "  \"city\": \"New York\"\n" +
                            "}";
            
            // С Java 13 - text blocks (тройные кавычки)
            String json = """
                          {
                            "name": "John",
                            "age": 30,
                            "city": "New York"
                          }
                          """;
            
            String sql = """
                         SELECT id, name, email
                         FROM users
                         WHERE active = true
                         ORDER BY created_at DESC
                         """;
            
            String html = """
                          <html>
                              <body>
                                  <h1>Title</h1>
                                  <p>Paragraph</p>
                              </body>
                          </html>
                          """;
            
            System.out.println(json);
            System.out.println(sql);
            System.out.println(html);
        }
    }
    
}
