package netology.tasks;

import lombok.Getter;
@Getter
public class SimpleTask extends Task {
    private static String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    @Override
    public boolean matches(String query) {
        return query.equals(title);
    }

}
