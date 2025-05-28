package org.example.service;

import org.example.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceImpl implements UserService{

    private List<User> users = new ArrayList<>();
    @Override
    public void addUser(User user) {
        if(user != null || user.getName() != null ) {
            users.add(user);
        }
    }

    @Override
    public boolean removeUserByName(String name) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public User getByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users);
    }
}
