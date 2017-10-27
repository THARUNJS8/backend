package com.niit.service;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryService {
public void saveCategory(Category category);
    
    public void update(Category category);
    
    public void delete(int categoryId);
    
    public Category getById(int categoryId);
    
    public List<Category> list();
    
}
