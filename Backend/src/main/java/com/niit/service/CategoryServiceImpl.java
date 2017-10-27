package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.Model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;
    
    public void saveCategory(Category category) {
        
        categoryDAO.saveCategory(category);
    }

    public void update(Category category) {
        // TODO Auto-generated method stub

    }

    public void delete(int categoryId) {
        // TODO Auto-generated method stub

    }

    public Category getById(int categoryId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Category> list() {
        // TODO Auto-generated method stub
        return null;
    }

}
