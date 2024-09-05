package netology.tasks;

import lombok.Getter;
@Getter
public class Epic extends Task {

    private static String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String task : subtasks) {
            if (task.equals(query)) {
                return true;
            }
        }
        return false;
    }

}
