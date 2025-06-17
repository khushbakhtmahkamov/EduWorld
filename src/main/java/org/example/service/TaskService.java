package org.example.service;

import  org.example.model.Task;
import java.util.List;

public interface TaskService {
    void createTask(Task task);

    Task getTaskById(Long taskId);

    List<Task> getAllTasks();

    void updateTask(Task task);

    void deleteTask(Long taskId);

    List<Task> getTasksByLessonId(Long lessonId);

    List<Task> getTasksByTypeId(Long typeId);

    List<Task> getActiveTasks();

}
