package com.oyms.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyms.mapper.UserMapper;
import com.oyms.model.User;
import com.oyms.model.UserExample;
import com.oyms.model.UserExample.Criteria;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public void userRegister(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}
   //检查用户名
	public boolean checkUserName(String userName) {
		UserExample userExample = new UserExample();
		Criteria criteria =userExample.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> users = userMapper.selectByExample(userExample);
		if(users.size() > 0) {
			return true;
		}else {
			return false;
		}
	}
   //检查登录
	public boolean checkForLogin(String userName, String userPassword) {
		UserExample userExample = new UserExample();
		Criteria criteria =userExample.createCriteria();
		criteria.andUsernameEqualTo(userName);
		criteria.andUserpasswordEqualTo(userPassword);
		List<User> users = userMapper.selectByExample(userExample);
		if(users.size() > 0) {
			return true;
		}else {
			return false;
		}
	}

	// 获取登录用户的url
	public String getUserImg(String userName) {
		UserExample userExample = new UserExample();
		Criteria criteria =userExample.createCriteria();
		criteria.andUsernameEqualTo(userName);
		List<User> user= userMapper.selectByExample(userExample);
		if(user.size()>0) {
		   return user.get(0).getUserimg();
		}else {
			return null;
		}
	}
	//获取登录用户的roleId
	public Integer getUserRoleId(String username) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		Criteria criteria =userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> user= userMapper.selectByExample(userExample);
		if(user.size()>0) {
			   return user.get(0).getRoleId();
			}else {
				return null;
			}
	}
}
