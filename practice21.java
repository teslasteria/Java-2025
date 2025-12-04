import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice21 {

public class ScannerFileExample {
    public static void main(String[] args) {
        // Путь к файлу (создайте файл data.txt в корне проекта)
        File file = new File("data.txt");
        
        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Чтение файла построчно:");
            
            // 1. Чтение построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("Строка: " + line);
            }
            
            // Для чтения с начала файла нужно создать новый Scanner
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        
        // Пример с различными типами данных в файле
        System.out.println("\nЧтение разных типов данных:");
        try (Scanner scanner = new Scanner(new File("mixed_data.txt"))) {
            // Предположим, содержимое файла:
            // John 25 85.5 true
            
            if (scanner.hasNext()) {
                String name = scanner.next();      // John
                int age = scanner.nextInt();       // 25
                double score = scanner.nextDouble(); // 85.5
                boolean active = scanner.nextBoolean(); // true
                
                System.out.printf("Имя: %s, Возраст: %d, Оценка: %.1f, Активен: %b%n", 
                    name, age, score, active);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        
        // Пример с разделителем
        System.out.println("\nЧтение CSV файла:");
        try (Scanner csvScanner = new Scanner(new File("data.csv"))) {
            csvScanner.useDelimiter(","); // Устанавливаем разделитель
            
            while (csvScanner.hasNext()) {
                String value = csvScanner.next().trim();
                System.out.println("Значение: " + value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("CSV файл не найден");
        }
    }
}
}
