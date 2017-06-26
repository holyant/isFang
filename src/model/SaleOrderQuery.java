package model;

import java.util.Date;

public class SaleOrderQuery {
	private String shopId;
	private Date statCycleStart;
	private Date statCycleEnd;
	private String serial;
	private int start;
	
	private Pager pager;
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public Date getStatCycleStart() {
		return statCycleStart;
	}
	public void setStatCycleStart(Date statCycleStart) {
		this.statCycleStart = statCycleStart;
	}
	public Date getStatCycleEnd() {
		return statCycleEnd;
	}
	public void setStatCycleEnd(Date statCycleEnd) {
		this.statCycleEnd = statCycleEnd;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
}
