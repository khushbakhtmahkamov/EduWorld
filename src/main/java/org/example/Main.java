package org.example;

import org.example.model.*;
import org.example.service.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        Role adminRole = new Role(1L, "Admin", "Administrator with full access", true);
        Role userRole = new Role(2L, "User", "Regular user with limited access", true);
        Language en = new Language(1L, "English", "en", true);
        Language ru = new Language(2L, "Russian", "ru", true);
        User user1 = new User(1L,"User1", 22, "test@maile", "122", en, adminRole);
        userService.addUser(user1);

        User user2 = new User(2L,"User2", 23, "test@maile1", "122", ru, userRole);
        userService.addUser(user2);
        List<User> users = userService.getByRole(adminRole);
        for (User user : users) {
            System.out.println("NameRU: " + user.getName() +
                    ", Age: " + user.getAge() +
                    ", Email: " + user.getEmail() +
                    ", Password: " + user.getPassword() +
                    ", Language: " + user.getLanguage().getName());
        }

        userService.removeUserByName(user1.getName());

        User foundUser = userService.getByName("User1");
        if (foundUser != null) {
            System.out.println("Found User: " + foundUser.getName() +
                    ", Age: " + foundUser.getAge() +
                    ", Email: " + foundUser.getEmail() +
                    ", Password: " + foundUser.getPassword());
        } else {
            System.out.println("User not found.");
        }

        System.out.println("After removing " + user1.getName() + ":");
        List<User> usersAfterRemove = userService.getUsers();
        for (User user : usersAfterRemove) {
            System.out.println("Name: " + user.getName() +
                    ", Age: " + user.getAge() +
                    ", Email: " + user.getEmail() +
                    ", Password: " + user.getPassword());
        }

        SubjectService subjectService = new SubjectServiceImpl();

        Subject math = new Subject();
        math.setTitle("Mathematics");
        math.setCode("MATH101");
        math.setCredits(3);
        math.setDescription("An introduction to mathematical concepts.");

        Subject history = new Subject();
        history.setTitle("History");
        history.setCode("HIST101");
        history.setCredits(3);
        history.setDescription("An overview of world history.");

        subjectService.addSubject(math);
        subjectService.addSubject(history);

        List<Subject> allSubjects = subjectService.getSubjects();
        System.out.println("All Subjects:");
        for (Subject subject : allSubjects) {
            System.out.println(subject);
        }


        subjectService.removeSubjectByCode("MATH101");
        System.out.println("After removing Mathematics:");

        List<Subject> remainingSubjects = subjectService.getSubjects();
        for (Subject subject : remainingSubjects) {
            System.out.println(subject);
        }

        LessonService lessonService = new LessonServiceImpl();

        Lesson lesson1 = new Lesson(1L, "2025-06-30", "2025-06-01", true, "Intro to Java", "Java Basics");
        Lesson lesson2 = new Lesson(2L, "2025-07-15", "2025-07-01", false, "Deep dive into Java", "Java Advanced");

        lessonService.addLesson(lesson1);
        lessonService.addLesson(lesson2);

        System.out.println("\nВсе уроки:");
        for (Lesson lesson : lessonService.getAllLessons()) {
            System.out.println(lesson.getId() + ": " + lesson.getName() + " — " + lesson.getStart_date() + " to " + lesson.getEnd_date());
        }

        System.out.println("\nАктивные уроки:");
        for (Lesson lesson : lessonService.getActiveLessons()) {
            System.out.println(lesson.getName());
        }

    }
}