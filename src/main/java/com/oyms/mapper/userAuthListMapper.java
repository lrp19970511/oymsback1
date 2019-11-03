package com.oyms.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.oyms.dto.UserDTO;
import com.oyms.model.User;

@Mapper
public interface userAuthListMapper {
	@Select("SELECT * from user INNER JOIN role ON user.role_id = role.id AND user.role_id>1 AND audit=1")
	List<UserDTO> getUserAuthList();
	
	@Select("SELECT * from user INNER JOIN role ON user.role_id = role.id AND user.role_id>1 AND audit>1 INNER JOIN auditstatus ON audit=auditstatus.id")
	List<UserDTO> getAuditList();
}
