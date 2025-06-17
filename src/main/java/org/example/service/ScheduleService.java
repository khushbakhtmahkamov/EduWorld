package org.example.service;
import org.example.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public interface ScheduleService {
    ArrayList<Schedule> getAllSchedules();

    // CRUD методы
    Schedule getScheduleById(Long id);
    void createSchedule(Schedule schedule);
    void updateSchedule(Long id, Schedule schedule);
    void deleteSchedule(Long id);

    // Методы для фильтрации
    ArrayList<Schedule> getSchedulesByUserId(Long userId);
    ArrayList<Schedule> getSchedulesByLessonId(Long lessonId);

    // Методы для поисков по датам
    ArrayList<Schedule> getSchedulesByDate(LocalDate date);
    ArrayList<Schedule> getSchedulesBetween(LocalDateTime start, LocalDateTime end);
}