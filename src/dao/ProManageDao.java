package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


import model.Label;
import model.Product;
import model.ProductQuery;
import model.Shop;

public interface ProManageDao {
	
	List<Product> getPros(ProductQuery query) throws SQLException;
	boolean addPro(Product product) throws SQLException;
	boolean editPro(Product product) throws SQLException;
	boolean delPro(Product product) throws SQLException;
	int updateProduct(Product p) throws SQLException;
	List<Label> getLabels() throws SQLException;
	void deleteProductById(String id) throws SQLException;
	
}
