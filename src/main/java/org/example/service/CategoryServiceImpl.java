package org.example.service;

import org.example.model.Category;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();

    @Override
    public void addCategory(Category category) {
        if(category !=null && category.getName() != null) {
            categories.add(category);
        }
    }

    @Override
    public boolean removeCategoryByName(String name) {
        Iterator<Category> iterator = categories.iterator();
        while (iterator.hasNext()) {
            Category category = iterator.next();
            if (category.getName().equals(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Category getByName(String name) {
        for (Category category : categories) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }
}
