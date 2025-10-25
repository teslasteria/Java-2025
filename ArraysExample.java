package javaEducation;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int[] a3 = {5, 4, 3, 2, 1};

        // Присваивание
        a1 = a2;
        System.out.println("a1 после a1 = a2: " + Arrays.toString(a1)); // [6,7,8,9,10]

        // Переменная a1 раньше указывала на массив {1,2,3,4,5}.
        // После присваивания a1 = a2; она теперь указывает на массив a2 — {6,7,8,9,10}.
        // Старый массив {1,2,3,4,5} остаётся в памяти, пока на него ссылается кто-то ещё или пока сборщик мусора его не удалит.

        // toString
        System.out.println("a3: " + Arrays.toString(a3)); // [5,4,3,2,1]

        // sort
        Arrays.sort(a3);
        System.out.println("a3 после сортировки: " + Arrays.toString(a3)); // [1,2,3,4,5]

        // binarySearch
        int index = Arrays.binarySearch(a3, 3);
        System.out.println("Индекс элемента 3 в a3: " + index); // 2

        // equals
        boolean eq = Arrays.equals(a3, a2);
        System.out.println("a3.equals(a2): " + eq); // false

        // Сравнение a3 и a2 лексикографически
        int cmp = Arrays.compare(a3, a2);
        System.out.println("Arrays.compare(a3, a2): " + cmp); // <0 если a3 < a2
    }
}
