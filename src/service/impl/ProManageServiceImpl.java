package service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Label;
import model.Product;
import model.ProductQuery;
import service.ProManageService;
import dao.ProManageDao;
@Service("proManageService")
public class ProManageServiceImpl implements ProManageService {
	@Autowired
	private ProManageDao proManageDao;
	

	@Override
	public List<Product> getPros(ProductQuery query) throws SQLException {
		return this.proManageDao.getPros(query);
	}

	@Override
	public boolean addPro(Product product) throws SQLException {
		return this.proManageDao.addPro(product);
	}

	@Override
	public int updateProduct(Product p) throws SQLException {
		return this.proManageDao.updateProduct(p);
	}

	@Override
	public List<Label> getLabels() throws SQLException {
		return this.proManageDao.getLabels();
	}

	@Override
	public void deleteProductById(String id) throws SQLException {
		this.proManageDao.deleteProductById(id);
	}
	
	
}
