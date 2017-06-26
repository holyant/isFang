package dao.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import model.User;
import dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SqlMapClient sqlMapClient;
	@Override
	public User getUserById(String id) throws SQLException {
		return (User)this.sqlMapClient.queryForObject("userSQL.getUserById", id);
	}

	@Override
	public User getUserByStaffId(String staffId) throws SQLException {
		return (User)this.sqlMapClient.queryForObject("userSQL.getUserByStaffId", staffId);
	}

	@Override
	public int updateUserPwd(User user) throws SQLException {
		return this.sqlMapClient.update("userSQL.changePw", user);
	}
	@Override
	public int deleteUser(User user) throws SQLException {
		return this.sqlMapClient.delete("userSQL.delUser", user);
	}
	@Override
	public User addUser(User user) throws SQLException {
		return (User)this.sqlMapClient.insert("userSQL.addUser", user);
	}
	
}
