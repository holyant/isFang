package model;

public class Product {
	private String id;
	private String label;
	private String no;
	private String name;
	private String size;
	private String unit;
	private Double cost;
	private String memo;
	
	public Product() {
		super();
	}
	public Product(String label, String no, String name,
			String size, String unit, Double cost, String memo) {
		super();
		this.label = label;
		this.no = no;
		this.name = name;
		this.size = size;
		this.unit = unit;
		this.cost = cost;
		this.memo = memo;
	}
	public Product(String id, String label, String no, String name,
			String size, String unit, Double cost, String memo) {
		super();
		this.id = id;
		this.label = label;
		this.no = no;
		this.name = name;
		this.size = size;
		this.unit = unit;
		this.cost = cost;
		this.memo = memo;
	}
	
	public Product(String id, String name, String size, String unit,
			Double cost, String memo) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.unit = unit;
		this.cost = cost;
		this.memo = memo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return this.id+this.label+this.name+this.no+this.size+this.unit+this.memo;
	}
	
}
