package com.thanhle.service;

import com.thanhle.pojo.User;

public interface BaseService {
	public boolean login(String username, String password);

	public String registration(User user);
}
