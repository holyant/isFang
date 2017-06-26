package model;

public class SaleProduct {
//	create table saleProduct(id int primary key auto_increment,serial varchar(64),proId varchar(64),amount int,
//			memo varchar(128))  ENGINE=InnoDB DEFAULT CHARSET=utf8;
	private int id;
	private String serial;
	private String proId;
	private String proName;
	private double amount;
	private double price;
	private String memo;
	
	private SaleOrder saleOrder;
	
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
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public SaleOrder getSaleOrder() {
		return saleOrder;
	}
	public void setSaleOrder(SaleOrder saleOrder) {
		this.saleOrder = saleOrder;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	
}
