package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.ProductDAO;
import com.niit.Model.Category;
import com.niit.Model.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDao;
	public void saveProduct(Product product) {
		
		productDao.saveProduct(product);
	}

	public List<Product> getallproducts() {
		return productDao.getallproducts();
	}
	public Product getproductbyid(int id) {
		return productDao.getproductbyid(id);
		 
	}
	public void deleteproduct(int id) {
		Product product= getproductbyid(id);
		productDao.deleteproduct(product);
	}
	public List<Category> getallcategories() {
		return productDao.getallcategories();
	}
	public void savecategory(Category category) {
		productDao.savecategory(category);
}
	
	
}
