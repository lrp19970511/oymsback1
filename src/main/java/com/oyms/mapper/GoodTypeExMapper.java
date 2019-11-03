package com.oyms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.oyms.model.GoodType;

@Mapper
public interface GoodTypeExMapper {
	@Select("SELECT * from goodtype INNER JOIN parenttype ON goodtype.parent_id = parenttype.id AND goodtype.isdelete = 0 AND parenttype.isdelete = 0 ORDER BY parenttype.pname ASC")
	List<GoodType> getGoogTypeList();
}
