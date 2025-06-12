package org.example.model;

public class Schedule {
    private long scheduleId;
    private String description;
    private boolean isActive;

    Lesson lesson;

    public Schedule(long scheduleId,String description, boolean isActive, Lesson lesson)
    {
        this.scheduleId = scheduleId;;
        this.description = description;
        this.isActive = isActive;
        this.lesson = lesson;
    }

    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

}
