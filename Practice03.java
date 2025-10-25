package javaEducation;

public class Practice03 {
    public void typeDataExamples() {
        byte byteValue = 100;
        short shortValue = 1000;
        short zeroValue = 0;
        int intValue = 100000;
        long longValue = 1000000000;
        float floatValue = 5.1245312f;
        double doubleValue = 90.3123124371241239123123;
        char charSymbol = 'A';
        boolean booleanValue = false;
        boolean otherBooleanValue = true;
    }
    public static void main(String[] args) {

        // task 2
        System.out.println("\u041A\u043E\u043D\u0441\u0442\u0430\u043D\u0442\u0438\u043D");

        //task 3
            int a = 1;
        {
            int b = 2;
        }
        // int c = a + b; // Ошибка

        // Переменная b объявлена внутри блока { } и доступна только внутри этого блока.
        // Когда выполнение доходит до строки int c = a + b;, переменная b уже недоступна,
        // поэтому программа не компилируется

         //task 4
        String name = "Константин";
        int age = 25;
        double height = 1.85;
        boolean student = true;

        // Оператор + перегружен для конкатенации строк
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height + " м");
        System.out.println("Студент: " + student);

        //task 5
        int numberOne = 5;
        double numberTwo = 2.5;
        double result = numberOne + numberTwo; // int → double

        System.out.println("Результат: " + result);

        //task 6
        double d = 9.78;
        int i = (int) d; // Сужающее преобразование (теряется дробная часть)
        System.out.println("i = " + i); // 9

        //task 7
    //     int a = 120;
    //     byte b = a + 10;          // Ошибка компиляции
    //     byte c = (byte)(a + 10);  // OK
    //     byte d = a + 1;           // Ошибка компиляции

    // Выражение a + 10 — это int, потому что арифметика в Java происходит минимум в int.
    // Поэтому byte b = a + 10; — ошибка: "possible lossy conversion from int to byte".
    // byte c = (byte)(a + 10); — корректно, потому что есть явное приведение типов.
    // a + 10 = 130, но byte хранит от -128 до 127 → значение становится -126.
    // byte d = a + 1; — также ошибка, потому что a + 1 — это int.

    //task 8
    var name_ = "Константин"; // String
    var age_ = 25;            // int
    var height_ = 1.85;       // double

    System.out.println(name_ + " — возраст " + age_ + ", рост " + height_);

    }

    

}
