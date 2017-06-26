package dao;

import java.sql.SQLException;
import java.util.List;


import model.Product;
import model.ProductQuery;
import model.SaleOrder;
import model.SaleOrderQuery;
import model.SaleProduct;
import model.Shop;
import model.vo.SaleOrderInfo;

public interface OrderManageDao {

	List<Shop> getClients(String attribute) throws SQLException;

	String getSerialByDate() throws SQLException;

	int saveSaleOrder(SaleOrder so) throws SQLException;

	void saveSalePros(String serial, List<SaleProduct> salePros) throws SQLException ;

	Product getProductById(int id) throws SQLException ;

	Shop getShopById(int shopId) throws SQLException ;

	String getLabelNameById(String label) throws SQLException ;

	List<SaleOrder> showOrders(SaleOrderQuery query) throws SQLException ;

	int deleteOrder(SaleOrderQuery query) throws SQLException;

	int getTotalOrderNum(SaleOrderQuery query) throws SQLException ;
	
	
}
