package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CartDAO;
import com.niit.Model.Cart;
@Service
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDAO cartDao;
	public void saveCart(Cart cart) {
		
		cartDao.saveCart(cart);
	}

}
