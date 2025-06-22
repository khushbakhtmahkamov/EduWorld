package org.example.service;

import org.example.model.Lesson;
import java.util.ArrayList;
import java.util.List;

public class LessonServiceImpl implements LessonService {

    private final List<Lesson> lessons = new ArrayList<>();

    @Override
    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    @Override
    public Lesson getLessonById(Long id) {
        for (Lesson lesson : lessons) {
            if (lesson.getId().equals(id)) {
                return lesson;
            }
        }
        return null;
    }

    @Override
    public List<Lesson> getAllLessons() {
        return new ArrayList<>(lessons);
    }

    @Override
    public void updateLesson(Lesson updatedLesson) {
        for (int i = 0; i < lessons.size(); i++) {
            if (lessons.get(i).getId().equals(updatedLesson.getId())) {
                lessons.set(i, updatedLesson);
                break;
            }
        }
    }

    @Override
    public void deleteLessonById(Long id) {
        lessons.removeIf(lesson -> lesson.getId().equals(id));
    }

    @Override
    public List<Lesson> getActiveLessons() {
        List<Lesson> activeLessons = new ArrayList<>();
        for (Lesson lesson : lessons) {
            if (lesson.isActive()) {
                activeLessons.add(lesson);
            }
        }
        return activeLessons;
    }
}

