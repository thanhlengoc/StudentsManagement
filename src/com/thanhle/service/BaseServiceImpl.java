package com.thanhle.service;

import com.thanhle.dao.BaseDao;
import com.thanhle.dao.BaseDaoImpl;
import com.thanhle.pojo.User;

public class BaseServiceImpl implements BaseService {

	private BaseDao loginDao = new BaseDaoImpl();

	@Override
	public boolean login(String username, String password) {
		return loginDao.login(username, password);
	}

	@Override
	public String registration(User user) {
		return loginDao.register(user);
	}

}
