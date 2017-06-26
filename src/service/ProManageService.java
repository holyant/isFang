package service;

import java.sql.SQLException;
import java.util.List;


import model.Label;
import model.Product;
import model.ProductQuery;

public interface ProManageService {
	
	List<Product> getPros(ProductQuery query) throws SQLException;
	
	boolean addPro(Product product) throws SQLException;

	int updateProduct(Product p) throws SQLException;
	
	List<Label> getLabels() throws SQLException;

	void deleteProductById(String id) throws SQLException;

}
