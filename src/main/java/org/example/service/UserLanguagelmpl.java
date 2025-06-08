package org.example.service;



public class UserLanguagelmpl implements UserLanguage {
    private String name;
    private String code;
    private boolean isActive;

    public UserLanguagelmpl(String language, String code, boolean isActive) {
        this.name = language;
        this.code = code;
        this.isActive = isActive;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }


}
