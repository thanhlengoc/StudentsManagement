package com.thanhle.dao;

import com.thanhle.pojo.User;

public interface BaseDao {
	public boolean login(String username, String password);

	public String register(User user);
}
