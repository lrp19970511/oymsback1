package com.oyms.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.oyms.dto.ApiDTO;
import com.oyms.model.GoodType;
import com.oyms.model.Goods;
import com.oyms.model.ParentType;
import com.oyms.service.GoodsService;

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private Goods goods;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private ApiDTO<Goods> apiDTO;
	@Autowired
	private ApiDTO<GoodType> apiDTO2;
	@Autowired
	private ApiDTO<ParentType> apiDTO3;
	@Autowired
	private GoodType goodType;
	@Autowired
	private ParentType parentType;

	// 商品管理控制
	@PostMapping("/add")
	public ApiDTO<Goods> addGoods(Goods goods, Long modifyId) {
		Date nowTime = new Date(System.currentTimeMillis());
		goods.setIsdelete((byte) 0);
		goods.setCreateTime(nowTime);
		if (modifyId == null || modifyId.toString() == "") {
			try {
				goodsService.addGoods(goods);
				apiDTO.setIsSuccess(true);
				return apiDTO;
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			try {
				goods.setId(modifyId);
				if (goodsService.modifyOneGood(goods) > 0) {
					apiDTO.setIsSuccess(true);
				}
				return apiDTO;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		apiDTO.setIsSuccess(false);
		return apiDTO;
	}

	@GetMapping("/show")
	public ApiDTO<Goods> showGoods() {
		try {
			apiDTO.setIsSuccess(true);
			apiDTO.setData(goodsService.getGoodsList());
			return apiDTO;
		} catch (Exception e) {
			// TODO: handle exception
		}
		apiDTO.setIsSuccess(false);

		return null;
	}

//删除一个商品
	@GetMapping("/isdelete")
	public ApiDTO<?> deleteOneGood(Long id) {
		if (goodsService.deleteOneGood(id) > 0) {
			apiDTO.setIsSuccess(true);
		} else {
			apiDTO.setIsSuccess(false);
		}
		return apiDTO;
	}

//	批量删除
	@PostMapping("/mutidelete")
	public ApiDTO<?> deleteList(@RequestBody JSONObject jsonObject) {
		String deleteGoodsList = jsonObject.getString("deleteIdList");
		if (goodsService.deleteList(deleteGoodsList) > 0) {
			apiDTO.setIsSuccess(true);
			return apiDTO;
		}
		apiDTO.setIsSuccess(false);
		return apiDTO;
	}

	// 商品类型控制
	// 添加商品类型
	@PostMapping("/addType")
	public ApiDTO<?> addType(GoodType goodType) {
		if (goodType.getPname() != null && goodType.getPname() != "") {
			parentType.setPname(goodType.getPname());
			parentType.setIsdelete((byte) 0);
			Integer pnameId = goodsService.addParentType(parentType);
			Date nowTime = new Date(System.currentTimeMillis());
			if (pnameId != null) {
				goodType.setCname(goodType.getCname());
				goodType.setParentId(pnameId);
				goodType.setCreateTime(nowTime);
				goodType.setIsdelete((byte) 0);
				if (goodsService.addGoodType(goodType) > 0) {
					apiDTO.setIsSuccess(true);
					return apiDTO;
				}
			}
		}
		apiDTO.setIsSuccess(false);
		return apiDTO;

	}

//获取商品类型列表
	@GetMapping("/showType")
	public ApiDTO<GoodType> showGoodType() {
		List<GoodType> goodTypeList = goodsService.getGoodTypeList();
		List<ParentType> parentTypeList = goodsService.getParentTypeList(); //获取父类型列表	
		apiDTO2.setData(goodTypeList);
		apiDTO3.setData2(parentTypeList);
		apiDTO2.setIsSuccess(true);
		return apiDTO2;
	}

	// 删除商品列表
	@GetMapping("/goodTypedelete")
	public ApiDTO<?> deleteGoodType(Integer goodTypeId) {
		if (goodsService.deleteGoodType(goodTypeId) > 0) {
			apiDTO.setIsSuccess(true);
		} else {
			apiDTO.setIsSuccess(false);
		}
		return apiDTO;
	}
}
