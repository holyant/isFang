package service;

import java.sql.SQLException;

import model.User;

public interface UserService {
	public User getUserById(String id) throws SQLException;
	public User getUserByStaffId(String staffId) throws SQLException;
	public int updateUserPwd(User user) throws SQLException ;
	public int deleteUser(User user) throws SQLException;
	public User addUser(User user) throws SQLException;
}
