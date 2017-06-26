package model;

public class Shop {
	private String id;
	private String name;
	private String person;
	private String addr;
	private String phone;
	private String memo;
	public Shop(){
		super();
	}
	
	public Shop(String id,String name, String person, String addr, String phone,String memo) {
		super();
		this.id = id;
		this.name = name;
		this.person = person;
		this.addr = addr;
		this.phone = phone;
		this.memo = memo;
	}
	public String getId() {
		return id; 
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
