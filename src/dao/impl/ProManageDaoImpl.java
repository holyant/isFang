package dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import util.Pager;

import model.Label;
import model.Product;
import model.ProductQuery;

import com.ibatis.sqlmap.client.SqlMapClient;

import dao.ProManageDao;
@Repository("proManageDao")
public class ProManageDaoImpl implements ProManageDao {
	@Autowired
	private SqlMapClient sqlMapClient;
	
	
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	public List<Product> getPros(ProductQuery query) throws SQLException{
		List<Product> list =  this.sqlMapClient.queryForList("proManageSQL.getProInfos",query);
		return list;
	}


	@Override
	public boolean delPro(Product product) throws SQLException{
		this.sqlMapClient.delete("proManageSQL.delPro",product);
		return true;
	}

	@Override
	public boolean editPro(Product product) throws SQLException{
		this.sqlMapClient.update("proManageSQL.editPro",product);
		return true;
	}

	@Override
	public boolean addPro(Product product) throws SQLException{
		this.sqlMapClient.insert("proManageSQL.addPro",product);
		return true;
	}

	@Override
	public int updateProduct(Product p) throws SQLException {
		return this.sqlMapClient.update("proManageSQL.editPro",p);
	}

	@Override
	public List<Label> getLabels() throws SQLException {
		return this.sqlMapClient.queryForList("proManageSQL.getLabels");
	}

	@Override
	public void deleteProductById(String id) throws SQLException {
		this.sqlMapClient.delete("proManageSQL.deleteProductById",id);
	}

	
	
}
