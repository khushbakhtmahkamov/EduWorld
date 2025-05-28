package org.example.service;

import org.example.model.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    boolean removeCategoryByName(String name);
    Category getByName(String name);
    List<Category> getCategories();
}
