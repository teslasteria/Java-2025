package javaEducation;

/**
 * WrapperClassesPractice.java
 *
 * Демонстрация работы с классами-оболочками (wrapper classes) из пакета java.lang:
 * Boolean, Character, Integer, Byte, Short, Long, Float, Double.
 *
 * Содержит примеры:
 *  - создания объектов-оболочек разными способами
 *  - использования decode(), valueOf(), parseXxx()
 *  - автоупаковки (boxing) и автораспаковки (unboxing)
 *  - NullPointerException при unboxing
 *  - IntegerCache и сравнение объектов Integer
 *
 * Автор: Константин
 */

 public class WrapperClassesPractice {
    public static void main(String[] args) {

        System.out.println("=== Практика #1 использование decode() ===");

        // Метод decode() преобразует строку в Integer, Long, Byte, Short
        // Поддерживаются форматы:
        //  - десятичный: "10"
        //  - восьмеричный: "012" (начинается с 0)
        //  - шестнадцатеричный: "0xA" или "#A"

        Integer dec1 = Integer.decode("12");   // 12 (десятичное)
        Integer dec2 = Integer.decode("012");  // 10 (восьмеричное)
        Integer dec3 = Integer.decode("0xA");  // 10 (шестнадцатеричное)
        Integer dec4 = Integer.decode("#A");   // 10 (альтернативная запись)

        System.out.println("decode(\"12\")  -> " + dec1);
        System.out.println("decode(\"012\") -> " + dec2);
        System.out.println("decode(\"0xA\") -> " + dec3);
        System.out.println("decode(\"#A\")  -> " + dec4);

        System.out.println("\n=== Практика #2 создание экземпляров Boolean ===");

        // Способы создания объектов Boolean:
        Boolean b1 = Boolean.valueOf(true);       // из примитива
        Boolean b2 = Boolean.valueOf("true");     // из строки
        Boolean b3 = Boolean.parseBoolean("false"); // парсинг строки
        Boolean b4 = true;                        // автоупаковка (boxing)

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println("\n=== Преобразование базовых типов в строки ===");

        int value = 12;
        String s1 = Integer.toString(value);
        String s2 = String.valueOf(value);

        System.out.println("Integer.toString(value): " + s1);
        System.out.println("String.valueOf(value): " + s2);

        System.out.println("\n=== Автоупаковка (boxing) и автораспаковка (unboxing) ===");

        Integer iObj = 12; // boxing (int → Integer)
        int iVal = iObj;   // unboxing (Integer → int)
        System.out.println("Boxed Integer iObj = " + iObj);
        System.out.println("Unboxed int iVal = " + iVal);

        // Указание типа явно
        // Float f1 = 12; // ошибка
        Float f2 = (float) 12; // правильный вариант
        Float f3 = 12F;        // короткий синтаксис
        System.out.println("f2 = " + f2 + ", f3 = " + f3);

        System.out.println("\n=== Практика #3 NullPointerException при unboxing ===");

        Integer nullInteger = null;

        try {
            int result = nullInteger; // unboxing null → вызывает NullPointerException
            System.out.println("result = " + result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: попытка автораспаковки null приводит к NullPointerException");
        }

        System.out.println("\n=== Практика #4 IntegerCache и сравнение объектов Integer ===");

        // int i1 = 128;
        // Integer a1 = i1;
        // Integer b1 = i1;
        // System.out.println("a1==i1 " + (a1 == i1)); // true (unboxing → сравнение по значению)
        // System.out.println("b1==i1 " + (b1 == i1)); // true
        // System.out.println("a1==b1 " + (a1 == b1)); // false (объекты вне кеша)
        // System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        // System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        // System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        // int i2 = 127;
        // Integer a2 = i2;
        // Integer b2 = i2;
        // System.out.println("\na2==i2 " + (a2 == i2)); // true
        // System.out.println("b2==i2 " + (b2 == i2));   // true
        // System.out.println("a2==b2 " + (a2 == b2));   // true (объекты из кеша)
        // System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
        // System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
        // System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true

        // 
        //     В Java для Integer, Byte, Short, Long и Character существует кэш объектов (IntegerCache).
        //     При автоупаковке (boxing) значения от -128 до 127 повторно используются из кэша.
        //     Поэтому для чисел в этом диапазоне ссылки (==) совпадают.
        //     Для значений вне диапазона создаются новые объекты, поэтому (==) возвращает false.
        //
    }
}
