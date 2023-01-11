package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao UserDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.UserDao = userDao;
	}//DI(Dependency Injection)
	
	@Override
	public User getUser() {
		 return UserDao.selectUser();
	}
}