package top.hellooooo.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.hellooooo.tx.dao.UserDao;

/**
 * @Author Q
 * @Date 14/11/2020 18:36
 * @Description
 */
@Service
public class UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public void insertUser(){
		userDao.insert();
		System.out.println("插入完成");
		int i = 19 / 0;
	}

}
