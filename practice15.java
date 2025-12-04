import java.util.Formatter;

public class practice15 {

    public class FormatExample {
        public static void main(String[] args) {
            Formatter fmt = new Formatter();
            
            // 1. %d - десятичное целое
            fmt.format("Число: %d%n", 42); // "Число: 42"
            
            // 2. %s - строковое представление
            fmt.format("Текст: %s%n", "Java"); // "Текст: Java"
            
            // 3. %f - десятичное с плавающей точкой
            fmt.format("Пи: %.2f%n", 3.14159); // "Пи: 3.14"
            
            // 4. %b - логическое значение
            fmt.format("Истина: %b%n", true); // "Истина: true"
            
            // 5. %c - символьное представление
            fmt.format("Символ: %c%n", 'A'); // "Символ: A"
            
            System.out.println(fmt);
        }
    }

    // practice 2

    // Без flush() данные могут не записаться сразу в файл
    // С flush() - гарантированная запись

    //practice 3

    /*
        %tY - год в 4-значном формате (2024)

    %tm - месяц в двузначном формате (01-12)

    %td - день месяца (01-31)

    %tH - час в 24-часовом формате (00-23)

    %tM - минуты (00-59)
     */
}


