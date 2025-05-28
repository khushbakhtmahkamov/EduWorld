package org.example;

import org.example.model.Language;
import org.example.model.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        Language en = new Language("English", "en", true);
        Language ru = new Language("Russian", "ru", true);
        User user1 = new User("User1", 22, "test@maile", "122", en);
        userService.addUser(user1);


        User user2 = new User("User2", 23, "test@maile1", "122", ru);
        userService.addUser(user2);
        List<User> users = userService.getUsersByLanguage(ru);
        for (User user : users) {
            System.out.println("NameRU: " + user.getName() +
                    ", Age: " + user.getAge() +
                    ", Email: " + user.getEmail() +
                    ", Password: " + user.getPassword()+
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
    }
}