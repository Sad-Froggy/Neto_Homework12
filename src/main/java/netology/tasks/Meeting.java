package netology.tasks;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Meeting extends Task {
    String topic;
    String project;
    String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public Meeting(int id) {
        super(id);
    }

    @Override
    public boolean matches(String query) {
        return query.equals(topic) || query.equals(project);
    }

}
