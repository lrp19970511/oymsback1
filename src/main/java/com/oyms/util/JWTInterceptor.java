package com.oyms.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.jsonwebtoken.Claims;

public class JWTInterceptor extends HandlerInterceptorAdapter {
	public static Integer statusCode;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String token = request.getHeader("token");
		// 验证token
		Claims claims = GetAndCheckToken.checkToken(token);
		if (claims != null && claims.toString() != "") {
			request.setAttribute("username", claims.getSubject());
			return true;
		}
		response.setStatus(statusCode);
		return false;
	}
}
