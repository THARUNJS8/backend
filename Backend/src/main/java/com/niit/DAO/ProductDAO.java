package com.niit.DAO;

import java.util.List;

import com.niit.Model.Category;
import com.niit.Model.Product;

public interface ProductDAO {
	public void saveProduct(Product product);
	List<Product> getallproducts();
	Product getproductbyid(int id);
	void deleteproduct(Product product);
	List<Category> getallcategories();
	void savecategory(Category category);
	
}
