public class practice08 {
    class Book {
        private String isbn;
        private String title;
        private int year;
        
        public Book(String isbn, String title, int year) {
            this.isbn = isbn;
            this.title = title;
            this.year = year;
        }
        
        @Override
        public boolean equals(Object obj) {
            // 1. Сравнение ссылок
            if (this == obj) return true;
            
            // 2. Проверка на null и совместимость типов
            if (obj == null || getClass() != obj.getClass()) return false;
            
            // 3. Приведение типа
            Book book = (Book) obj;
            
            // 4. Сравнение по значимым полям
            return year == book.year &&
                   isbn.equals(book.isbn) &&
                   title.equals(book.title);
        }
        
        @Override
        public int hashCode() {
            return 31 * isbn.hashCode() + title.hashCode() + year;
        }
    }

    /*
    Соглашения для equals():

    Рефлексивность: x.equals(x) == true

    Симметричность: x.equals(y) == y.equals(x)

    Транзитивность: если x.equals(y) и y.equals(z), то x.equals(z)

    Консистентность: многократные вызовы дают одинаковый результат

    Null-безопасность: x.equals(null) == false

    Согласованность с hashCode: если x.equals(y), то x.hashCode() == y.hashCode()
    */
}
