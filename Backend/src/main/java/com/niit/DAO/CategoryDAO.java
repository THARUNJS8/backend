package com.niit.DAO;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryDAO {
	
	public void saveCategory(Category category);
	public void update(Category category);
	public void delete(int categoryId);
	public Category getbyId(int categoryId);
	public List<Category> list();
	
}
