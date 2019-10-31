package com.oyms.controller;

import java.util.Date;

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

	@PostMapping("/register")
	public ApiDTO<?> userRegister(User user) {
		Date nowDate = new Date();
		user.setCreatetime(nowDate);
		user.setRoleId(3);
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
	@GetMapping("/getRoleId")
	public ApiDTO<?> getRoleId(String token) throws ServletException{
		ApiDTO<Object> apiDTO2 =new ApiDTO<Object>();
		Claims claims = GetAndCheckToken.checkToken(token);
		Integer roleId =(Integer) claims.get("roles");
		if(roleId == null ) {
			apiDTO2.setIsSuccess(false);
			apiDTO2.setCode(700);
			apiDTO2.setMessage("你没有权限进行此操作");
			return apiDTO2;
		}
		else if(roleId != 1 && roleId !=2 ) {
			System.err.println(roleId);
			apiDTO2.setIsSuccess(false);
			apiDTO2.setCode(700);
			apiDTO2.setMessage("你没有权限进行此操作");
			return apiDTO2;
		}else {
		apiDTO2.setCode(100);
		apiDTO2.setIsSuccess(true);
		return apiDTO2;
		}
	}
}
