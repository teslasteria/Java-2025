package javaEducation;

public class Practice05 {
    public static void main(String[] args) {

        System.out.println("=== АРИФМЕТИЧЕСКИЕ ОПЕРАТОРЫ ===");
        int a = 10;
        int b = 3;

        // Базовые арифметические операции
        int sum = a + b;        // сложение
        int diff = a - b;       // вычитание
        int prod = a * b;       // умножение
        int div = a / b;        // целочисленное деление
        int mod = a % b;        // остаток от деления

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + prod);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);

        System.out.println("\n=== ОПЕРАТОРЫ ПРИСВАИВАНИЯ ===");
        int x = 5;
        x += 3; // эквивалентно x = x + 3;
        x -= 2; // эквивалентно x = x - 2;
        x *= 4;
        x /= 6;
        x %= 3;
        System.out.println("x после серии операций: " + x);

        System.out.println("\n=== ИНКРЕМЕНТ / ДЕКРЕМЕНТ ===");
        int y = 5;
        System.out.println("Префиксный инкремент ++y: " + (++y)); // 6
        System.out.println("Постфиксный инкремент y++: " + (y++)); // 6 → 7
        System.out.println("Префиксный декремент --y: " + (--y)); // 6
        System.out.println("Постфиксный декремент y--: " + (y--)); // 6 → 5
        System.out.println("Итоговое значение y: " + y); // 5

        System.out.println("\n=== ОПЕРАТОРЫ СРАВНЕНИЯ ===");
        int p = 10, q = 20;
        System.out.println("p > q = " + (p > q));
        System.out.println("p <= q = " + (p <= q));
        System.out.println("p == q = " + (p == q));
        System.out.println("p != q = " + (p != q));

        System.out.println("\n=== ЛОГИЧЕСКИЕ ОПЕРАТОРЫ ===");
        boolean b1 = true, b2 = false;
        System.out.println("b1 && b2 = " + (b1 && b2)); // И
        System.out.println("b1 || b2 = " + (b1 || b2)); // ИЛИ
        System.out.println("!b1 = " + (!b1));           // НЕ
        System.out.println("b1 ^ b2 = " + (b1 ^ b2));   // Исключающее ИЛИ

        System.out.println("\n=== ПОБИТОВЫЕ ОПЕРАТОРЫ ===");
        int bitA = 5;   // 0101
        int bitB = 3;   // 0011
        System.out.println("bitA & bitB = " + (bitA & bitB)); // 1
        System.out.println("bitA | bitB = " + (bitA | bitB)); // 7
        System.out.println("bitA ^ bitB = " + (bitA ^ bitB)); // 6
        System.out.println("~bitA = " + (~bitA));             // -6 (инверсия)

        System.out.println("\n=== СДВИГИ ===");
        int shift = 8; // 1000₂
        System.out.println("shift >> 1 = " + (shift >> 1));  // 4
        System.out.println("shift << 1 = " + (shift << 1));  // 16
        System.out.println("shift >>> 1 = " + (shift >>> 1)); // 4 (беззнаковый сдвиг)

        System.out.println("\n=== ТЕРНАРНЫЙ ОПЕРАТОР ===");
        int max = (a > b) ? a : b;
        System.out.println("Максимум из " + a + " и " + b + " = " + max);

        System.out.println("\n=== ОПЕРАТОРЫ СО СТРОКАМИ ===");
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2; // Конкатенация
        s1 += " Java!"; // Оператор += тоже выполняет конкатенацию
        System.out.println("Конкатенация: " + s3);
        System.out.println("После += : " + s1);

        // Сравнение строк
        String s4 = "Java";
        String s5 = new String("Java");
        System.out.println("s4 == s5: " + (s4 == s5));         // сравнение ссылок (обычно false)
        System.out.println("s4.equals(s5): " + s4.equals(s5)); // сравнение содержимого (true)

        System.out.println("\n=== ПРИМЕР ПОРЯДКА ВЫПОЛНЕНИЯ ===");
        int result = 2 + 3 * 4; // умножение выполняется раньше сложения
        System.out.println("2 + 3 * 4 = " + result); // 14
        result = (2 + 3) * 4; // скобки изменяют приоритет
        System.out.println("(2 + 3) * 4 = " + result); // 20

        System.out.println("\n=== ОПЕРАТОР instanceof ===");

        // Вложенные классы для примера
        class Animal {}
        class Dog extends Animal {}

        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal ref = new Dog();
        Animal nullObj = null;

        // Проверяем принадлежность типов
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // false
        System.out.println("ref instanceof Dog: " + (ref instanceof Dog));       // true
        System.out.println("nullObj instanceof Animal: " + (nullObj instanceof Animal)); // false
    }
}
