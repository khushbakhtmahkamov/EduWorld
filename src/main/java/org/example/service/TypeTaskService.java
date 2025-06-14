package org.example.service;

import org.example.model.TypeTask;

import java.util.List;

public interface TypeTaskService {

    TypeTask create(TypeTask typeTask);
    boolean deleteById(Long id);
    TypeTask update(TypeTask typeTask);
    TypeTask getById(Long id);
    List<TypeTask> getAll();
}
