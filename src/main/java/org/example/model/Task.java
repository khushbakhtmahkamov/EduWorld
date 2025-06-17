package org.example.model;

public class Task {
    private Long taskId;
    private String question;
    private String start_date;
    private String end_date;
    private boolean isActive;
    private int level;
    private Long typeId;
    private Long lessonId;

    public Task () {}

    public Task (Long taskId, String description, String start_date, String end_date, boolean isActive, int level, Long typeId, Long lessonId) {
        this.taskId = taskId;
        this.question = description;
        this.start_date = start_date;
        this.end_date = end_date;
        this.isActive = isActive;
        this.level = level;
        this.typeId = typeId;
        this.lessonId = lessonId;
    }

    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getStart_date() {
        return start_date;
    }
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    public String getEnd_date() {
        return end_date;
    }
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public Long getTypeId() {
        return typeId;
    }
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
    public Long getLessonId() {
        return lessonId;
    }
    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }
}
