package util;

public class Pager {
	/** 当前页 */
	private int pageIndex = 1;
	/** 页面行数 */
	private int pageSize = 10;
	/** 总页数 */
	private int pageSum = 0;
	/** 操作 */
	private char flag = 'F';
	/** 开始行数(包含) */
	private int beginNum = 0;
	/** 结束行数（包含） */
	private int endNum = 0;
	/** 总行数 */
	private int rowSum = 0;
	/** 描述 */
	private String pagerDecs;
	private boolean hasPrevPage;
	private boolean hasNextPage;
	private int deviationRow;

	/**
	 * @return the hasPrevPage
	 */
	public boolean isHasPrevPage() {
		return hasPrevPage;
	}

	/**
	 * @param hasPrevPage
	 *            the hasPrevPage to set
	 */
	public void setHasPrevPage(boolean hasPrevPage) {
		this.hasPrevPage = hasPrevPage;
	}

	/**
	 * @return the hasNextPage
	 */
	public boolean isHasNextPage() {
		return hasNextPage;
	}

	/**
	 * @param hasNextPage
	 *            the hasNextPage to set
	 */
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	/**
	 * @return the PageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param PageIndex
	 *            the PageIndex to set
	 */
	public void setPageIndex(int PageIndex) {
		this.pageIndex = PageIndex;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the pageSum
	 */
	public int getPageSum() {
		return pageSum;
	}

	/**
	 * @param pageSum
	 *            the pageSum to set
	 */
	public void setPageSum(int pageSum) {
		this.pageSum = pageSum;
	}

	/**
	 * @return the flag
	 */
	public char getFlag() {
		return flag;
	}

	/**
	 * @param flag
	 *            the flag to set
	 */
	public void setFlag(char flag) {
		this.flag = flag;
	}

	/**
	 * @return the beginNum
	 */
	public int getBeginNum() {
		return beginNum;
	}

	/**
	 * @return the endNum
	 */
	public int getEndNum() {

		return endNum;
	}

	/**
	 * @return the rowSum
	 */
	public int getRowSum() {
		return rowSum;
	}

	/**
	 * @param rowSum
	 *            the rowSum to set
	 */
	public void setRowSum(int rowSum) {
		this.pageSum = (rowSum + pageSize - 1) / pageSize;
		this.rowSum = rowSum;
	}

	/**
	 * @return the pagerDecs
	 */
	public String getPagerDecs() {
		return pagerDecs;
	}

	public void refreshPager() {
		switch (this.flag) {
		case 'F':
			pageIndex = 1;
			break;
		case 'P':
			pageIndex = pageIndex - 1;
			break;
		case 'N':
			pageIndex = pageIndex + 1;
			break;
		case 'L':
			pageIndex = pageSum;
			break;
		default:
			break;
		}
		beginNum = pageSize * (pageIndex - 1) + 1+deviationRow;
		endNum = pageSize * pageIndex+deviationRow;
		if (pageIndex < pageSum) {
			this.hasNextPage = true;
		} else {
			this.hasNextPage = false;
		}
		if (pageIndex > 1) {
			this.hasPrevPage = true;
		} else {
			this.hasPrevPage = false;
		}
		this.pagerDecs = "共有记录" + this.rowSum + "条  当前:"
				+ this.pageIndex + "/" + pageSum + "页  每页" + pageSize
				+ "条";
	}

	/**
	 * @return the deviationRow
	 */
	public int getDeviationRow() {
		return deviationRow;
	}

	/**
	 * @param deviationRow the deviationRow to set
	 */
	public void setDeviationRow(int deviationRow) {
		this.deviationRow = deviationRow;
	}

	/**
	 * @param beginNum the beginNum to set
	 */
	public void setBeginNum(int beginNum) {
		this.beginNum = beginNum;
	}

	/**
	 * @param endNum the endNum to set
	 */
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
}
