package org.example.service;

import org.example.model.Language;
import org.example.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    boolean removeUserByName(String name);

    User getByName(String name);

    List<User> getUsers();

    List<User> getUsersByLanguage(Language language);
}
