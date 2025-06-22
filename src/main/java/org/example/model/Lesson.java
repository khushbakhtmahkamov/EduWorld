package org.example.model;

import java.time.LocalDateTime;

public class Lesson {
    private Long id;
    private String name;
    private String description;
    private boolean isActive;
    private String start_date;
    private String end_date;

    public Lesson(Long id, String end_date, String start_date, boolean isActive, String description, String name) {
        this.id = id;
        this.end_date = end_date;
        this.start_date = start_date;
        this.isActive = isActive;
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public LocalDateTime getStartTime() {
        return LocalDateTime.parse(start_date);
    }

    public LocalDateTime getEndTime() {
        return LocalDateTime.parse(end_date);
    }

    public Long getLessonId() {
        return id;
    }

    public Long getUserId() {
        return id;
    }
}
