package com.oyms.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyms.dto.UserDTO;
import com.oyms.mapper.AuditStatuMapper;
import com.oyms.mapper.RoleMapper;
import com.oyms.mapper.UserMapper;
import com.oyms.mapper.userAuthListMapper;
import com.oyms.model.AuditStatu;
import com.oyms.model.AuditStatuExample;
import com.oyms.model.ParentType;
import com.oyms.model.ParentTypeExample;
import com.oyms.model.Role;
import com.oyms.model.RoleExample;
import com.oyms.model.User;
import com.oyms.model.UserExample;
import com.oyms.model.UserExample.Criteria;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private userAuthListMapper userAuthListMapper;
	@Autowired 
	private RoleMapper roleMapper;
	@Autowired
	private AuditStatuMapper auditStatuMapper;

	//注册用户
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
		criteria.andAuditEqualTo(1);
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
	//获取带权限的用户列表
	public List<UserDTO> getUserAuthList() {
		// TODO Auto-generated method stub
		List<UserDTO> getUserAuthList = userAuthListMapper.getUserAuthList();
		return getUserAuthList;
	}
	//获取权限表
	public List<Role> getRoles(){
		RoleExample roleExample = new RoleExample();
		com.oyms.model.RoleExample.Criteria criteria = roleExample.createCriteria();
		criteria.andIdNotEqualTo(1);
		List<Role> getRoles = roleMapper.selectByExample(roleExample);
		return getRoles;
	}
	//根据权限名字获取权限id
	public Integer getRoleId(String authname) {
		Integer authId = null;
		if (authname != null) {
			RoleExample roleExample = new RoleExample();
			com.oyms.model.RoleExample.Criteria criteria = roleExample.createCriteria();
			criteria.andNameEqualTo(authname);
			List<Role> roles = roleMapper.selectByExample(roleExample);
			if (roles.size() > 0) {
				authId = roles.get(0).getId();
				return authId;
			} else {
				return null;
			}
		}
		return null;
	}
	//根据审核状态名字获取审核状态id
	public Integer getAuditStatuId(String auditStatu) {
		Integer auditStatuId = null;
		if (auditStatu != null) {
			AuditStatuExample auditStatuExample = new AuditStatuExample();
			com.oyms.model.AuditStatuExample.Criteria criteria = auditStatuExample.createCriteria();
			criteria.andAuditStatuEqualTo(auditStatu);
			List<AuditStatu> auditStatus = auditStatuMapper.selectByExample(auditStatuExample);
			if (auditStatus.size()>0) {
				auditStatuId = auditStatus.get(0).getId();
				return auditStatuId;
			}else {
				return null;
			}
		}
		return null;
	}
	//修改用户权限
	public Integer modifyUserAuth(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}
	//获取待审核用户名单
	public List<UserDTO> getAuditList() {
		
		return userAuthListMapper.getAuditList();
	}
}
