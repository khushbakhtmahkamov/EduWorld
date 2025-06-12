package org.example.service;
import org.example.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class ScheduleServiceImpl implements ScheduleService {
    private ArrayList<Schedule> schedules = new ArrayList<Schedule>();

    // CRUD методы
    @Override
    public ArrayList<Schedule> getAllSchedules()
    {
        return schedules;
    }

    @Override
    public Schedule getScheduleById(Long id) {
        for (Schedule schedule : schedules) {
            if (id.equals(schedule.getScheduleId()))
            {
                return schedule;
            }
        }
        return null;
    }

    @Override
    public void createSchedule(Schedule schedule) {
        if (schedule != null) {
            schedules.add(schedule);
        }
    }

    @Override
    public void updateSchedule(Long id, Schedule newSchedule) {
        for (int i = 0; i < schedules.size(); i++)
        {
            if (id.equals(schedules.get(i).getScheduleId()))
            {
                schedules.set(i, newSchedule);
                break;
            }
        }
    }

    @Override
    public void deleteSchedule(Long id) {
        schedules.removeIf(schedule -> id.equals(schedule.getScheduleId()));
    }


    // Методы для фильтрации
    @Override
    public ArrayList<Schedule> getSchedulesByUserId(Long userId)
    {
        ArrayList<Schedule> schedulesByUser = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (userId.equals(schedule.getLesson().getUserId()))
            {
                schedulesByUser.add(schedule);
            }
        }
        return schedulesByUser;
    }

    @Override
    public ArrayList<Schedule> getSchedulesByLessonId(Long lessonId) {
        ArrayList<Schedule> schedulesByLesson = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (lessonId.equals(schedule.getLesson().getLessonId())) {
                schedulesByLesson.add(schedule);
            }
        }
        return schedulesByLesson;
    }

    @Override
    public ArrayList<Schedule> getSchedulesByDate(LocalDate date) {
        ArrayList<Schedule> schedulesByDate = new ArrayList<>();
        for (Schedule schedule : schedules) {
            LocalDateTime startTime = schedule.getLesson().getStartTime();
            if (startTime != null && date.equals(startTime.toLocalDate())) {
                schedulesByDate.add(schedule);
            }
        }
        return schedulesByDate;
    }

    @Override
    public ArrayList<Schedule> getSchedulesBetween(LocalDateTime start, LocalDateTime end) {
        ArrayList<Schedule> schedulesInRange = new ArrayList<>();
        for (Schedule schedule : schedules) {
            LocalDateTime lessonStart = schedule.getLesson().getStartTime();
            LocalDateTime lessonEnd = schedule.getLesson().getEndTime();
            if (lessonStart != null && lessonEnd != null &&
                    !lessonEnd.isBefore(start) && !lessonStart.isAfter(end)) {
                schedulesInRange.add(schedule);
            }
        }
        return schedulesInRange;
    }

}
