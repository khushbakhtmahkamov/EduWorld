package org.example;

import org.example.model.Language;
import org.example.model.Role;
import org.example.model.Subject;
import org.example.model.User;
import org.example.model.Task;
import org.example.service.SubjectService;
import org.example.service.SubjectServiceImpl;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.example.service.TaskService;
import org.example.service.TaskServiceImpl;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        Role adminRole = new Role(1L, "Admin", "Administrator with full access", true);
        Role userRole = new Role(2L, "User", "Regular user with limited access", true);
        Language en = new Language("English", "en", true);
        Language ru = new Language("Russian", "ru", true);
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

        List<Task> taskList = new ArrayList<>();

        Task task1 = new Task(1L, "Solve equation x + 2 = 5", "2025-06-10", "2025-06-20", true, 1, 101L, 201L);
        Task task2 = new Task(2L, "Read about World War II", "2025-06-11", "2025-06-25", false, 2, 102L, 202L);

        taskList.add(task1);
        taskList.add(task2);

        System.out.println("\nВсе задачи:");
        for (Task task : taskList) {
            System.out.println("ID: " + task.getTaskId()
                    + ", Вопрос: " + task.getQuestion()
                    + ", Активна: " + task.isActive()
                    + ", Уровень: " + task.getLevel());
        }

        // Фильтрация: активные задачи
        System.out.println("\nАктивные задачи:");
        for (Task task : taskList) {
            if (task.isActive()) {
                System.out.println("ID: " + task.getTaskId()
                        + ", Вопрос: " + task.getQuestion());
            }
        }

    }
}