package org.example.model;

public class Language {
    private Long id;
    String name;
    String code;
    boolean isActive;

    public Language(Long id, String name, String code, boolean isActive) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.isActive = isActive;
    }

    public Language(long id, String en, boolean b) {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {

        isActive = active;
    }
}


