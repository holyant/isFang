package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import util.Pager;

import model.Product;
import model.ProductQuery;
import model.SaleOrder;
import model.SaleOrderQuery;
import model.SaleProduct;
import model.Shop;
import model.vo.SaleOrderInfo;

import com.ibatis.sqlmap.client.SqlMapClient;

import dao.OrderManageDao;
import dao.ProManageDao;
@Repository("orderManageDao")
public class OrderManageDaoImpl implements OrderManageDao {
	@Autowired
	private SqlMapClient sqlMapClient;

	@Override
	public List<Shop> getClients(String attribute) throws SQLException {
		List<Shop> list =  this.sqlMapClient.queryForList("orderManageSQL.getClients",attribute);
		return list;
	}

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public String getSerialByDate() throws SQLException {
		return (String)this.sqlMapClient.queryForObject("orderManageSQL.getSerial");
	}

	@Override
	public int saveSaleOrder(SaleOrder so) throws SQLException {
		return this.sqlMapClient.update("orderManageSQL.saveSaleOrder",so);
	}

	@Override
	public void saveSalePros(String serial, List<SaleProduct> salePros) throws SQLException {
		for(SaleProduct pro:salePros){
			pro.setSerial(serial);
			this.sqlMapClient.insert("orderManageSQL.saveSalePro", pro);
		}
	}

	@Override
	public Product getProductById(int id) throws SQLException {
		return (Product)this.sqlMapClient.queryForObject("orderManageSQL.getProduct", id);
	}

	@Override
	public Shop getShopById(int shopId) throws SQLException {
		return (Shop)this.sqlMapClient.queryForObject("orderManageSQL.getShop", shopId);
	}

	@Override
	public String getLabelNameById(String label) throws SQLException {
		return (String)this.sqlMapClient.queryForObject("orderManageSQL.getLabelName", label);
	}

	@Override
	public List<SaleOrder> showOrders(SaleOrderQuery query) throws SQLException {
//		 List<SaleOrderInfo> list = this.sqlMapClient.queryForList("orderManageSQL.showOrders",query);
		List<SaleOrder> list = this.sqlMapClient.queryForList("orderManageSQL.selectSaleOrders",query);
		return list;
	}

	@Override
	public int deleteOrder(SaleOrderQuery query) throws SQLException {
		int re = 0;
		re = this.sqlMapClient.delete("orderManageSQL.deleteOrder",query);
		if(re==0){
			return re;
		}
		re = this.sqlMapClient.delete("orderManageSQL.deleteOrderProduct",query);
		if(re==0){
			return re;
		}
		return re;
	}

	@Override
	public int getTotalOrderNum(SaleOrderQuery query) throws SQLException {
		return (Integer) this.sqlMapClient.queryForObject("orderManageSQL.getTotalOrderNum",query);
	}
	
	
	
}
