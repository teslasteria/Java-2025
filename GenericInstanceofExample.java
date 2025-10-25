package javaEducation;

/**
 * GenericInstanceofExample.java
 *
 * Демонстрация использования оператора instanceof с generic-классами.
 * 
 * Автор: Константин
 */

 class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericInstanceofExample {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> strWrapper = new Wrapper<>();

        // instanceof работает только с сырым типом (raw type)
        if (intWrapper instanceof Wrapper) {
            System.out.println("intWrapper является экземпляром Wrapper");
        }

        if (strWrapper instanceof Wrapper) {
            System.out.println("strWrapper является экземпляром Wrapper");
        }

        // Нельзя проверить generic тип напрямую:
        // if (intWrapper instanceof Wrapper<Integer>) {} // Ошибка компиляции
    }
}
