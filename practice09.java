public class practice09 {
    // практика 1
    public class Outer {
        // 1. Public - доступен откуда угодно
        public class InnerPublic {}
        
        // 2. Protected - доступен в том же пакете и подклассах
        protected class InnerProtected {}
        
        // 3. Package-private (default) - только в том же пакете
        class InnerPackage {}
        
        // 4. Private - только внутри Outer
        private class InnerPrivate {}
    }

    // практика 2

    public class Outer_ {
        private String privateField = "private";
        protected String protectedField = "protected";
        String packageField = "package";
        public String publicField = "public";
        
        class Inner {
            void accessOuter() {
                // Полный доступ ко всем полям внешнего класса
                System.out.println(privateField);     // ✓
                System.out.println(protectedField);   // ✓
                System.out.println(packageField);     // ✓
                System.out.println(publicField);      // ✓
            }
        }
    }

    // практика 3
    
    public class Outer__ {
        void accessInner() {
            // Создаем объект внутреннего класса
            Inner inner = new Inner();
            
            // Доступ зависит от спецификаторов внутреннего класса:
            // - publicField: ✓ доступен
            // - protectedField: ✓ доступен (Outer - enclosing класс)
            // - packageField: ✓ доступен (тот же пакет)
            // - privateField: ✗ НЕ доступен
            System.out.println(inner.publicField);
            System.out.println(inner.protectedField);
            System.out.println(inner.packageField);
            // System.out.println(inner.privateField); // Ошибка!
        }
        
        class Inner {
            private String privateField = "private";
            protected String protectedField = "protected";
            String packageField = "package";
            public String publicField = "public";
        }
    }
}
