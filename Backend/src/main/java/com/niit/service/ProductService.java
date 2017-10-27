package com.niit.service;

import java.util.List;

import com.niit.Model.Category;
import com.niit.Model.Product;

public interface ProductService {
	public void saveProduct(Product product);
	List<Product> getallproducts();
	Product getproductbyid(int id);
	void deleteproduct(int id);
	List<Category> getallcategories();
	void savecategory(Category category);
}
