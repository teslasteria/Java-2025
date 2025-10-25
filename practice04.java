package javaEducation;

public class practice04 {
    /**
 * Класс, представляющий пользователя системы.
 * @author Константин
 * @version 1.0
 */
public class User {
    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Создаёт нового пользователя.
     * @param name имя пользователя
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя пользователя.
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }
}
}
