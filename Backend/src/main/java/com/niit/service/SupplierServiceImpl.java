package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.SupplierDAO;
import com.niit.Model.Supplier;
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDAO supplierDao;
	public void saveSupplier(Supplier supplier) {
		
		supplierDao.saveSupplier(supplier);
	}

}
