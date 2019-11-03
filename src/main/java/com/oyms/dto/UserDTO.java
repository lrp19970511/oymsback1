package com.oyms.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserDTO {
	private Integer id;
	private String name;
	private String userName;
	private String userImg;
	private Integer roleId;
	private Integer audit;
	private String auditStatu;
}

