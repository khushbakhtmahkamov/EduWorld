package org.example.service;

import org.example.model.Language;
import java.util.List;

public interface LanguageService {
        String getCode();              // ISO-код, например "en"
        String getName();              // Название, например "English"
        boolean isActive();            // Активен ли язык


    void createLanguage(Language language);

    void deleteLanguage(Language language);

    void setActive(Long id, boolean active);

    List<Language> getAllLanguages();

    Language getLanguageByCode(String code);
}
