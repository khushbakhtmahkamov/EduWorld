package org.example.service;


import org.example.model.Language;
import java.util.ArrayList;
import java.util.List;

public class LanguageServicelmpl implements LanguageService {
    private String name;
    private String code;
    private boolean isActive;

    private final List<Language> languageList = new ArrayList<Language>();

    public LanguageServicelmpl(String language, String code, boolean isActive) {
        this.name = language;
        this.code = code;
        this.isActive = isActive;
    }

    public LanguageServicelmpl() {
        this.name = "";
        this.code = "";
        this.isActive = false;
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

    @Override
    public void createLanguage(Language language) {
        languageList.add(language);
    }

    @Override
    public void deleteLanguage(Language language) {
        languageList.remove(language);

    }

    @Override
    public void setActive(Long id, boolean active) {
        for (Language lang : languageList) {
            if (lang.getId().equals(id)) {
                lang.setActive(active);
                break;
            }
        }

    }

    @Override
    public List<Language> getAllLanguages() {
        return languageList;
    }

    @Override
    public Language getLanguageByCode(String code) {
        for (Language lang : languageList) {
            if (lang.getCode().equals(code)) {
                return lang;
            }
        }
        return null;
    }


}
