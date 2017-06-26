package service.impl;

import java.sql.SQLException;
import java.util.List;

import model.Shop;
import model.ShopQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.ShopManageService;
import dao.ShopManageDao;
@Service("shopManageService")
public class ShopManageServiceImpl implements ShopManageService {
	@Autowired
	private ShopManageDao shopManageDao;
	

	@Override
	public List<Shop> getShops(ShopQuery query) throws SQLException {
		return this.shopManageDao.getShops(query);
	}

	@Override
	public boolean addShop(Shop shop) throws SQLException {
		return this.shopManageDao.addShop(shop);
	}

	@Override
	public int updateShop(Shop s) throws SQLException {
		return this.shopManageDao.updateShop(s);
	}
	@Override
	public void deleteShop(ShopQuery query) throws SQLException {
		this.shopManageDao.deleteShop(query);
	}
	
	
}
