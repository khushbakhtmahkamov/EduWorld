package org.example.service;

import org.example.model.Lesson;
import java.util.List;

public interface LessonService {

    void addLesson(Lesson lesson);

    Lesson getLessonById(Long id);

    List<Lesson> getAllLessons();

    void updateLesson(Lesson lesson);

    void deleteLessonById(Long id);

    List<Lesson> getActiveLessons();
}

