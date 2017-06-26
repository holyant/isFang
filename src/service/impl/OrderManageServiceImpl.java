package service.impl;

import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import model.Pager;
import model.Product;
import model.SaleOrder;
import model.SaleOrderQuery;
import model.SaleProduct;
import model.Shop;
import model.vo.SaleOrderInfo;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.OrderManageService;
import util.DateUtil;
import util.MyProperties;
import util.NumberUtil;
import dao.OrderManageDao;

@Service("orderManageService")
public class OrderManageServiceImpl implements OrderManageService {
	private static final Logger logger = Logger.getLogger(OrderManageServiceImpl.class);
	@Autowired
	private OrderManageDao orderManageDao;

	@Override
	public List<Shop> getClients(String attribute) throws SQLException {
		return this.orderManageDao.getClients(attribute);
	}

	@Override
	public String saveSaleOrder(String orderDate,String label, int shopId,
			List<SaleProduct> salePros ) throws Exception {
		String serial = this.orderManageDao.getSerialByDate();
		if(null==serial){
			DateUtil dateUtil = new DateUtil();
			serial = dateUtil.getFormatDate(new Date(), "yyyyMM")+"0001";
		}else{
			Long l = Long.parseLong(serial)+1;
			serial = l.toString();
		}
		
		SaleOrder so = new SaleOrder(serial,shopId,new Date());
		int re = this.orderManageDao.saveSaleOrder(so);
		if(re!=1){
			throw new RuntimeException("保存订单失败");
		}
		this.orderManageDao.saveSalePros(serial,salePros);
		Shop shop = (Shop)this.orderManageDao.getShopById(shopId);
		String labelName = (String)this.orderManageDao.getLabelNameById(label);
		this.makeExcel(orderDate,shop.getName() , shop.getPerson(),shop.getAddr(), shop.getPhone(), serial, labelName, salePros);
		return serial;
	}
	
	public void makeExcel(String orderDate,String clientName,String connect,String clientAddr,String phone,String serial,
			String label,List<SaleProduct> pros) throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFRow row = null;
		HSSFCell cell = null;
		Double sumPrice = 0.0;
		int sumAmount = 0;
		HSSFSheet sheet = wb.createSheet("sheet1");
		//设置列宽
		sheet.setColumnWidth(0, 1423);
		sheet.setColumnWidth(1, 1423);
		sheet.setColumnWidth(3, 4242);
		sheet.setColumnWidth(4, 1400);
		sheet.setColumnWidth(5, 1400);
		sheet.setColumnWidth(6, 1400);
		
		//台头
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 10));
		
		row =sheet.createRow(0);
		cell = row.createCell(0);
		this.setTitle(wb,cell,"杭州钧嘉化妆品有限公司   【销售单】");
		row.setHeightInPoints((short)70);
		
		//客户\联系人\录单日期
		row =sheet.createRow(1);
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 0, 1));
		this.setContent(wb, row,0, "客户名称：");
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 2, 3));
		this.setContent(wb, row,2, clientName);
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 4, 5));
		this.setContent(wb, row,4, "联系人：");
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 6, 7));
		this.setContent(wb, row,6, connect);
		
		this.setContent(wb, row,8, "录单日期:");
		
		
		sheet.addMergedRegion(new CellRangeAddress(1, 1, 9, 10));
		this.setContent(wb, row,9,orderDate);
		
		//客户地址,联系电话,单据编号
		row =sheet.createRow(2);
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, 1));
		cell = row.createCell(0);
		this.setContent(wb, row,0, "客户地址");
		
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 2, 3));
		this.setContent(wb, row,2, clientAddr);
		
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 4, 5));
		this.setContent(wb, row,4, "联系电话");
		
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 6, 7));
		this.setContent(wb, row,6, phone);
		
		this.setContent(wb, row,8, "单据编号");
		
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 9, 10));
		this.setContent(wb, row,9, serial);
		
		
		//订货品牌
		row =sheet.createRow(3);
		
		sheet.addMergedRegion(new CellRangeAddress(3, 3, 0, 1));
		this.setContent(wb, row,0, "订货品牌");
		
		sheet.addMergedRegion(new CellRangeAddress(3, 3, 2, 10));
		this.setContent(wb, row,2, label);
		
		//附加说明
		row =sheet.createRow(4);
		
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 0, 1));
		this.setContent(wb, row,0, "附加说明：");
		
		sheet.addMergedRegion(new CellRangeAddress(4, 4, 2, 10));
		this.setContent(wb, row,2, "如有差异，请在收到货后三日之内电话联系客服，过期作废不予处理，多谢合作。");
		
		//序号,商品编号,商品名称,,规格,单位,数量,单价,金额,备注,
		row =sheet.createRow(5);
		this.setContent(wb, row,0, "序号");
		
		this.setContent(wb, row,1, "编号");
		
		sheet.addMergedRegion(new CellRangeAddress(5, 5, 2, 3));
		this.setContent(wb, row,2, "商品名称");
		
		this.setContent(wb, row,4, "规格");
		
		this.setContent(wb, row,5, "单位");
		
		this.setContent(wb, row,6, "数量");
		
		this.setContent(wb, row,7, "单价");
		
		this.setContent(wb, row,8, "金额");
		
		sheet.addMergedRegion(new CellRangeAddress(5, 5, 9, 10));
		this.setContent(wb, row,9, "备注");
		
		DecimalFormat df1 = new DecimalFormat("####.#");
		
		int rowNum = 5;
		for(int i=0;i<pros.size();i++){
			SaleProduct salePro = pros.get(i);
			Product pro =  this.orderManageDao.getProductById(Integer.parseInt(salePro.getProId()));
			row =sheet.createRow(++rowNum);
			this.setContent(wb, row,0, (i+1)+"");
			
			this.setContent(wb, row,1, pro.getNo());
			
			sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 2, 3));
			this.setContent(wb, row,2,pro.getName() );
			
			this.setContent(wb, row,4, pro.getSize());
			
			this.setContent(wb, row,5, pro.getUnit());
			
			this.setContent(wb, row,6, ""+df1.format(salePro.getAmount()));
			sumAmount+=salePro.getAmount();
			this.setContent(wb, row,7, ""+df1.format(pro.getCost()));
			
			this.setContent(wb, row,8, df1.format((salePro.getAmount()*pro.getCost()))+"");
			sumPrice+= salePro.getAmount()*pro.getCost();
			sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 9, 10));
//			this.setContent(wb, row,9, "");
			
		}
		sheet.addMergedRegion(new CellRangeAddress(6, rowNum, 9, 10));
		
		//合计金额：		大写：	贰佰元整					小写	¥200	元
		row =sheet.createRow(++rowNum);
		
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, 1));
		this.setContent(wb, row,0, "合计金额：");
		this.setContent(wb, row,2, "大写：");
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 3, 7));
		if(0>sumPrice){
			this.setContent(wb, row, 3, "负"+NumberUtil.toBigAmt(-sumPrice));
		}else{
			this.setContent(wb, row, 3, NumberUtil.toBigAmt(sumPrice));
		}
		
		this.setContent(wb, row,8, "小写：");
		this.setContent(wb, row, 9, ""+df1.format(sumPrice));
		this.setContent(wb, row,10, "元");
		
		//货品件数合计:
		row =sheet.createRow(++rowNum);
		
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, 6));
		this.setContent(wb, row,0, "此销售单为客户收货和查帐重要凭据，请妥善保管。");
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 7, 8));
		this.setContent(wb, row,7, "货品件数合计:");
		this.setContent(wb, row, 9, sumAmount+"");
		this.setContent(wb, row,10, "件");
		
		//服务热线		0571-87717555、87717558			制单人：	女王大人		发货人：	孟妍妍	
		row =sheet.createRow(++rowNum);
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, 1));
		this.setContent(wb, row,0, "服务热线	");
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 2, 4));
		this.setContent(wb, row,2, "0571-87717555、87717558	");
		this.setContent(wb, row,5, "制单：	");
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 6, 7));
		this.setContent(wb, row,6, "万芳芳");
		this.setContent(wb, row,8, "发货人：");
		sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 9, 10));
		this.setContent(wb, row,9, "胡慧");
		String fileNameStr = serial+".xls";
		//把订单文件备份到本地
		Properties properties = MyProperties.getProperties("/sys.properties");
		FileOutputStream os = new FileOutputStream(properties.getProperty("orderFilePath")+fileNameStr);
		wb.write(os);
		os.flush();
		os.close();
		
	}
	
	public HSSFCell setTitle(HSSFWorkbook wb,HSSFCell cell,String value){
		HSSFFont font = wb.createFont();
		HSSFCellStyle style = wb.createCellStyle();
		font.setFontHeightInPoints((short)22);
		style.setAlignment(CellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		style.setFont(font);
		cell.setCellStyle(style);
		cell.setCellValue(value);
		return cell;
	}
	public HSSFCell setContent(HSSFWorkbook wb,HSSFRow row,int column,String value){
		row.setHeightInPoints((short)23);
		HSSFFont font = wb.createFont();
		HSSFCellStyle style = wb.createCellStyle();
		HSSFCell cell = row.createCell(column);
		font.setFontHeightInPoints((short)11);
		style.setAlignment(CellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		style.setFont(font);
		cell.setCellStyle(style);
		cell.setCellValue(value);
		return cell;
	}

	@Override
	public Pager showOrders(Pager pager,SaleOrderQuery query) throws SQLException {
		int pageNum = pager.getPageNum();
		if("N".equals(pager.getFlag())){
			pageNum++;
		}else if("P".equals(pager.getFlag())){
			pageNum--;
		}
		if(pageNum==0){
			pageNum = 1;
			int totalNum = this.getTotalOrderNum(query);
			pager.setTotalPage(totalNum%10==0?totalNum/10:totalNum/10+1);
		}
		query.setStart((pageNum-1)*10);
		pager.setPageNum(pageNum);
		pager.setResult(this.orderManageDao.showOrders(query));
		return pager;
	}

	private int getTotalOrderNum(SaleOrderQuery query) throws SQLException {
		return this.orderManageDao.getTotalOrderNum(query);
	}

	@Override
	public int deleteOrder(SaleOrderQuery query) throws SQLException {
		return this.orderManageDao.deleteOrder(query);
		
	}
	
	
	
	
}
