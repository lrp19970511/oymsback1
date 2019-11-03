package com.oyms.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.oyms.dto.ApiDTO;
import com.oyms.dto.UserDTO;
import com.oyms.model.Role;
import com.oyms.model.User;
import com.oyms.service.UserService;
import com.oyms.util.GetAndCheckToken;

import io.jsonwebtoken.Claims;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	@Autowired
	private User user;
	@Autowired
	private UserService userService;
	@Autowired
	private ApiDTO<?> apiDTO;
	@Autowired
	private ApiDTO<UserDTO> apiDTOUser;
	@Autowired
	private ApiDTO<Role> apiDTORole;

	@PostMapping("/register")
	public ApiDTO<?> userRegister(User user) {
		Date nowDate = new Date();
		user.setCreatetime(nowDate);
		user.setRoleId(4);	//roleId=4为无权限状态
		user.setAudit(3);   //audit=3为待审核状态
		if (userService.checkUserName(user.getUsername())) {
			apiDTO.setIsSuccess(false);
			apiDTO.setCode(500);
			apiDTO.setMessage("用户已存在");
			return apiDTO;
		} else {
			userService.userRegister(user);
			apiDTO.setIsSuccess(true);
			apiDTO.setCode(200);
			apiDTO.setMessage("注册成功");
			return apiDTO;
		}
	}

	@PostMapping("/login")
	public ApiDTO<?> userLogin(User user) {
		if (userService.checkForLogin(user.getUsername(), user.getUserpassword())) {
			Integer userRoleId = userService.getUserRoleId(user.getUsername());
			String token = GetAndCheckToken.getToken(user.getUsername(),userRoleId);
			apiDTO.setIsSuccess(true);
			apiDTO.setCode(200);
			apiDTO.setToken(token);
			apiDTO.setMessage(userService.getUserImg(user.getUsername()));
		} else {
			apiDTO.setIsSuccess(false);
			apiDTO.setCode(500);
			apiDTO.setMessage("用户名或密码错误");
		}
		return apiDTO;
	}
	//判断用户权限,code700为超级管理员，701为普通管理员，702为普通用户
	@GetMapping("/getRoleId")
	public ApiDTO<?> getRoleId(String token) throws ServletException{
		ApiDTO<Object> apiDTO2 =new ApiDTO<Object>();
		Claims claims = GetAndCheckToken.checkToken(token);
		Integer roleId =(Integer) claims.get("roles");
		if(roleId == null) {
			apiDTO2.setIsSuccess(false);
			apiDTO2.setCode(702);
			apiDTO2.setMessage("你没有权限进行此操作");
			return apiDTO2;
		}else if(roleId == 1) {
			apiDTO2.setIsSuccess(true);
			apiDTO2.setCode(700);
			return apiDTO2;
		}
		else if(roleId == 2 ) {
			apiDTO2.setIsSuccess(true);
			apiDTO2.setCode(701);
			return apiDTO2;
		}else {
		apiDTO2.setCode(702);
		apiDTO2.setIsSuccess(false);
		apiDTO2.setMessage("你没有权限进行此操作");
		return apiDTO2;
		}
	}
//获取带权限的用户列表
	@GetMapping("/showuserlist")
	public ApiDTO<?> getUserAuthList(){
		try {
			List<UserDTO> getUserAuthList = userService.getUserAuthList();
			List<Role> getRolesMessage = userService.getRoles();
			apiDTOUser.setIsSuccess(true);
			apiDTOUser.setData(getUserAuthList);
			apiDTORole.setData2(getRolesMessage);
			return apiDTO;
		} catch (Exception e) {
			// TODO: handle exception
			apiDTO.setIsSuccess(false);
			return apiDTO;
		}
	}
//修改用户权限
	@GetMapping("/userAuthModify")
	public ApiDTO<?> modifyUserAuth(UserDTO userDTO){
		if (userDTO != null) {
			Integer newRoleId =  userService.getRoleId(userDTO.getName());
			user.setRoleId(newRoleId);
			user.setId(userDTO.getId());
			if (userService.modifyUserAuth(user)>0) {
				apiDTO.setIsSuccess(true);
			}else {
				apiDTO.setIsSuccess(false);
			}
		}else {
			apiDTO.setIsSuccess(false);
		}
		return apiDTO;
	}
//获取待审核用户列表
	@GetMapping("/showauditlist")
	public ApiDTO<?> getAuditList(){
		try {
			List<UserDTO> getAuditList = userService.getAuditList();
			apiDTOUser.setIsSuccess(true);
			apiDTOUser.setData(getAuditList);
			return apiDTOUser;
		} catch (Exception e) {
			// TODO: handle exception
			apiDTOUser.setIsSuccess(false);
			return apiDTOUser;
		}
	}
//初始化用户权限以及设置用户审核状态
	@GetMapping("/audituser")
	public ApiDTO<?> auditUser(UserDTO userDTO){
		if (userDTO != null) {
			Integer newRoleId = userService.getRoleId(userDTO.getName());
			user.setRoleId(newRoleId);
			user.setId(userDTO.getId());
			Integer newAuditId = userService.getAuditStatuId(userDTO.getAuditStatu());
			user.setAudit(newAuditId);
			if (userService.modifyUserAuth(user)>0) {
				apiDTO.setIsSuccess(true);
			}else {
				apiDTO.setIsSuccess(false);
			}
		}else {
			apiDTO.setIsSuccess(false);
		}
		return apiDTO;
	}
	
}
