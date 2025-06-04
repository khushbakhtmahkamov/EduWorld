package org.example.service;

import org.example.model.Subject;

import java.util.List;

public interface SubjectService {
    void addSubject(Subject subject);

    boolean removeSubjectByCode(String code);

    Subject getByCode(String code);

    List<Subject> getSubjects();

    List<Subject> getSubjectsByCredits(int credits);
}