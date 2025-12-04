public class inheritance {
    class Parent {
        public final void showMessage() {
            System.out.println("Это финальный метод в Parent. Его нельзя переопределить.");
        }
        
        public void regularMethod() {
            System.out.println("Обычный метод в Parent.");
        }
    }
    
    class Child extends Parent {
        @Override
        public void regularMethod() {
            System.out.println("Переопределённый метод в Child.");
        }
        
        /*
        @Override
        public void showMessage() {  // Ошибка: cannot override final method
            System.out.println("Попытка переопределить final метод.");
        }
        */
    }

        // Финальный класс - нельзя наследовать
    final class FinalClass {
        public void show() {
            System.out.println("Метод финального класса");
        }
    }

    // Пытаемся наследовать от final-класса - ЭТО ВЫЗОВЕТ ОШИБКУ КОМПИЛЯЦИИ
    /*
    class ChildClass extends FinalClass {  // Ошибка: cannot inherit from final
        public void additionalMethod() {
            System.out.println("Дополнительный метод");
        }
    }
    */
    
    public class Main {
        public static void main(String[] args) {
            Parent parent = new Parent();
            Child child = new Child();
            
            parent.showMessage();    // Работает
            child.showMessage();     // Работает (наследуется final-метод)
            
            parent.regularMethod();  // Вызывается метод Parent
            child.regularMethod();   // Вызывается переопределённый метод Child
            
            // Можно раскомментировать некорректный метод в классе Child,
            // чтобы увидеть ошибку компиляции:
            // "showMessage() in Child cannot override showMessage() in Parent"
            // "overridden method is final"
        }
    }
}
