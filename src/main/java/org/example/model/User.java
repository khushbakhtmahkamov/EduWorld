package org.example.model;

public class User {
    private String name;
    private int age;
    private String email;
    private String password;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, int age, String email, String password, Language language) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.language = language;
    }
}
