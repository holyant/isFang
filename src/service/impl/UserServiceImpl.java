package service.impl;

import java.sql.SQLException;

import model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.UserService;

import dao.UserDao;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(String id) throws SQLException {
		return this.userDao.getUserById(id);
	}

	@Override
	public User getUserByStaffId(String staffId) throws SQLException {
		return this.userDao.getUserByStaffId(staffId);
	}

	@Override
	public int updateUserPwd(User user) throws SQLException {
		return this.userDao.updateUserPwd(user);
	}
	@Override
	public int deleteUser(User user) throws SQLException {
		return this.userDao.deleteUser(user);
	}
	@Override
	public User addUser(User user) throws SQLException {
		return this.userDao.addUser(user);
	}
}
