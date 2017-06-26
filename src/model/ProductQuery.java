package model;

public class ProductQuery {
	private String label;
	private String id;

	
	public ProductQuery() {
		super();
	}
	public ProductQuery(String label) {
		super();
		this.label = label;
	}
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
