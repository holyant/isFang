package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import util.Pager;

import model.Product;
import model.ProductQuery;
import model.SaleOrder;
import model.SaleProduct;
import model.Shop;
import model.ShopQuery;

import com.ibatis.sqlmap.client.SqlMapClient;

import dao.OrderManageDao;
import dao.ProManageDao;
import dao.ShopManageDao;
@Repository("shopManageDao")
public class ShopManageDaoImpl implements ShopManageDao {
	@Autowired
	private SqlMapClient sqlMapClient;

	@Override
	public List<Shop> getShops(ShopQuery query) throws SQLException {
		List<Shop> list =  this.sqlMapClient.queryForList("shopManageSQL.getShops",query);
		return list;
	}

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public boolean addShop(Shop shop) throws SQLException {
		 this.sqlMapClient.insert("shopManageSQL.addShop", shop);
		 return true;
	}

	@Override
	public int updateShop(Shop s) throws SQLException {
		return this.sqlMapClient.update("shopManageSQL.updateShop",s);
	}

	@Override
	public void deleteShop(ShopQuery query) throws SQLException {
		this.sqlMapClient.delete("shopManageSQL.deleteShop",query);
	}

	
	
}
