package javaEducation;

/**
 * AccessModifiersExample.java
 *
 * Демонстрация работы спецификаторов доступа в Java:
 * private, default (package-private), protected, public.
 *
 * Автор: Константин
 */

 // Класс с разными спецификаторами доступа
 class ExampleClass {
 
     private int privateVar = 1;        // доступ только внутри ExampleClass
     int defaultVar = 2;                // default, доступ внутри пакета
     protected int protectedVar = 3;    // доступ внутри пакета и подклассов
     public int publicVar = 4;          // доступ отовсюду
 
     // private метод
     private void privateMethod() {
         System.out.println("privateMethod: доступ только внутри класса");
     }
 
     // default метод
     void defaultMethod() {
         System.out.println("defaultMethod: доступ внутри пакета");
     }
 
     // protected метод
     protected void protectedMethod() {
         System.out.println("protectedMethod: доступ в пакете и подклассах");
     }
 
     // public метод
     public void publicMethod() {
         System.out.println("publicMethod: доступ везде");
     }
 
     // Метод для демонстрации доступа к private членам внутри класса
     public void accessPrivateInside() {
         System.out.println("Доступ к privateVar внутри класса: " + privateVar);
         privateMethod();
     }
 }
 
 // Подкласс в том же пакете
 class SubClassSamePackage extends ExampleClass {
     public void testAccess() {
         System.out.println("protectedVar в подклассе: " + protectedVar); // доступ есть
         System.out.println("publicVar в подклассе: " + publicVar);       // доступ есть
         // System.out.println("privateVar в подклассе: " + privateVar); // ошибка, private недоступно
         // defaultVar доступно, т.к. в том же пакете
         System.out.println("defaultVar в подклассе: " + defaultVar);
     }
 }
 
 // Главный класс с main
 public class AccessModifiersExample {
     public static void main(String[] args) {
         ExampleClass obj = new ExampleClass();
 
         // Доступ к public члену
         System.out.println("obj.publicVar = " + obj.publicVar);
         obj.publicMethod();
 
         // Доступ к protected и default членам внутри того же пакета
         System.out.println("obj.protectedVar = " + obj.protectedVar);
         obj.protectedMethod();
 
         System.out.println("obj.defaultVar = " + obj.defaultVar);
         obj.defaultMethod();
 
         // Доступ к private члену напрямую невозможен
         // System.out.println("obj.privateVar = " + obj.privateVar); // Ошибка
         // obj.privateMethod(); // Ошибка
 
         // Доступ к private через публичный метод класса
         obj.accessPrivateInside();
 
         System.out.println("\n=== Доступ из подкласса в том же пакете ===");
         SubClassSamePackage sub = new SubClassSamePackage();
         sub.testAccess();
     }
 }
 