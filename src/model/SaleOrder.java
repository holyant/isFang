package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SaleOrder {
//	create table saleOrder(id int primary key auto_increment,serial varchar(64),shopId int,createTime datetime,
//			memo varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;
	private int id;
	private String serial;
	private int shopId;
	private String shopName;
	private Date createTime;
	private String memo;
	
	private List<SaleProduct> saleProducts = new ArrayList<SaleProduct>();
	
	public SaleOrder(){
		super();
	}
	public SaleOrder(String serial, int shopId, Date createTime) {
		super();
		this.serial = serial;
		this.shopId = shopId;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public List<SaleProduct> getSaleProducts() {
		return saleProducts;
	}
	public void setSaleProducts(List<SaleProduct> saleProducts) {
		this.saleProducts = saleProducts;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
}
