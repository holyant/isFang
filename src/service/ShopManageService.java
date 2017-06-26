package service;

import java.sql.SQLException;
import java.util.List;


import model.Product;
import model.ProductQuery;
import model.Shop;
import model.ShopQuery;

public interface ShopManageService {
	
	List<Shop> getShops(ShopQuery query) throws SQLException;
	
	boolean addShop(Shop shop) throws SQLException;

	int updateShop(Shop s) throws SQLException;

	void deleteShop(ShopQuery query) throws SQLException;

}
