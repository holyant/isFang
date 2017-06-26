package service;

import java.sql.SQLException;
import java.util.List;

import model.Pager;
import model.SaleOrderQuery;
import model.SaleProduct;
import model.Shop;
import model.vo.SaleOrderInfo;

public interface OrderManageService {

	List<Shop> getClients(String attribute) throws SQLException;

	public String saveSaleOrder(String orderDate,String label, int shopId, List<SaleProduct> salePros) throws Exception;

	Pager showOrders(Pager pager,SaleOrderQuery query) throws SQLException;

	int deleteOrder(SaleOrderQuery query) throws SQLException;
	
}
