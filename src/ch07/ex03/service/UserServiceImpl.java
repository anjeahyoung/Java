package ch07.ex03.service;

import ch07.ex03.dao.UserDao;
import ch07.ex03.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao UserDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.UserDao = userDao;
	}
	
	@Override
	public User getUser() {
		return UserDao.selectUser();
	}
	
	@Override
	public void addUser(User user) {
		UserDao.insertUser(user);
	}
	
	@Override
	public void fixUser(String userName) {
		UserDao.updateUser(userName);
	}
	
	@Override
	public void delUser() {
		UserDao.deleteUser();
	}
}