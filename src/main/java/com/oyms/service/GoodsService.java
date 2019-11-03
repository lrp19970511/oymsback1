package com.oyms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyms.mapper.GoodTypeExMapper;
import com.oyms.mapper.GoodTypeMapper;
import com.oyms.mapper.GoodsMapper;
import com.oyms.mapper.ParentTypeMapper;
import com.oyms.model.GoodType;
import com.oyms.model.GoodTypeExample;
import com.oyms.model.Goods;
import com.oyms.model.GoodsExample;
import com.oyms.model.GoodsExample.Criteria;
import com.oyms.model.ParentType;
import com.oyms.model.ParentTypeExample;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodTypeMapper goodTypeMapper;
	@Autowired
	private ParentTypeMapper parentTypeMapper;
	@Autowired
	private GoodTypeExMapper goodTypeExMapper;

	// 商品管理方法
	public void addGoods(Goods goods) {
		goodsMapper.insert(goods);
	}

	// 获取商品列表
	public List<Goods> getGoodsList() {
		GoodsExample goodsExample = new GoodsExample();
		Criteria criteria = goodsExample.createCriteria();
		criteria.andIsdeleteNotEqualTo((byte) 1);
		goodsExample.setOrderByClause("create_time desc");
		List<Goods> getGoods = goodsMapper.selectByExample(goodsExample);
		return getGoods;
	}

	// 删除单个商品
	public int deleteOneGood(Long id) {
		Goods goods = new Goods();
		goods.setId(id);
		goods.setIsdelete((byte) 1);
		return goodsMapper.updateByPrimaryKeySelective(goods);
	}

	// 修改商品信息
	public int modifyOneGood(Goods goods) {
		int isModify = goodsMapper.updateByPrimaryKey(goods);
		return isModify;
	}

	// 批量商品删除
	public Integer deleteList(Long[] goodIdList) {
		Goods goods = new Goods();
		Integer isDelete = 0;
		if (goodIdList.length>0) {
			for (Long deleteId : goodIdList) {
				goods.setId(deleteId);
				goods.setIsdelete((byte) 1);
				isDelete = goodsMapper.updateByPrimaryKeySelective(goods);
				if (isDelete == 0) {
					return isDelete;
				}
			}
		}
		return isDelete;
	}

	// 商品类型管理方法
	// 添加父类型
	public Integer addParentType(ParentType parentType) {
		Integer pnameID = null;
		if (parentType != null) {
			ParentTypeExample parentTypeExample = new ParentTypeExample();
			com.oyms.model.ParentTypeExample.Criteria criteria = parentTypeExample.createCriteria();
			criteria.andPnameEqualTo(parentType.getPname());
			List<ParentType> parentTypes = parentTypeMapper.selectByExample(parentTypeExample);
			if (parentTypes.size() > 0) {
				pnameID = parentTypes.get(0).getId();
			} else {
				parentTypeMapper.insert(parentType);
				List<ParentType> parentTypes2 = parentTypeMapper.selectByExample(parentTypeExample);
				pnameID = parentTypes2.get(0).getId();
			}
			return pnameID;
		}
		return null;
	}

//添加子类型
	public Integer addGoodType(GoodType goodType) {
		if (goodType != null) {
			Integer ischange = goodTypeMapper.insert(goodType);
			return ischange;
		} else {
			return 1;
		}
	}
//添加父类型
	public Integer addParentGoodType(ParentType parentType) {
		if (parentType != null) {
			Integer ischange = parentTypeMapper.insert(parentType);
			return ischange;
		}else {
			return 0;
		}
	}
	
//修改子类型
	public Integer modifyGoodType(GoodType goodType) {
		if (goodType != null) {
			Integer ischange = goodTypeMapper.updateByPrimaryKeySelective(goodType);
			return ischange;
		}else {
			return 0;
		}
	}
//修改父类型
	public Integer modifyParentGoodType(ParentType parentType) {
		if (parentType != null) {
			Integer ischange = parentTypeMapper.updateByPrimaryKeySelective(parentType);
			return ischange;
		}else {
			return 0;
		}
		
	}
//获取类型列表
	public List<GoodType> getGoodTypeList() {
		// TODO Auto-generated method stub
		List<GoodType> b = goodTypeExMapper.getGoogTypeList();
		return b;
	}

//获取父类型列表
	public List<ParentType> getParentTypeList() {
		ParentTypeExample parentTypeExample = new ParentTypeExample();
		com.oyms.model.ParentTypeExample.Criteria criteria = parentTypeExample.createCriteria();
		criteria.andIsdeleteNotEqualTo((byte) 1);
		parentTypeExample.setOrderByClause(null);
		List<ParentType> getParentTypes = parentTypeMapper.selectByExample(parentTypeExample);
		return getParentTypes;
	}

//删除子类型
	public int deleteGoodType(Integer id) {
		GoodType goodType = new GoodType();
		goodType.setId(id);
		goodType.setIsdelete((byte) 1);
		return goodTypeMapper.updateByPrimaryKeySelective(goodType);
	}
	//删除父类型
	public int deleteParentGoodType(Integer id) {
		ParentType parentType = new ParentType();
		parentType.setId(id);
		parentType.setIsdelete((byte) 1);
		return parentTypeMapper.updateByPrimaryKeySelective(parentType);
	}
	// 批量商品删除
	public Integer delGoodTypeList(Integer[] goodTypeIdList) {
		GoodType goodtype = new GoodType();
		Integer isDelete = 0;
		if (goodTypeIdList.length>0) {
			for (Integer deleteId : goodTypeIdList) {
				goodtype.setId(deleteId);
				goodtype.setIsdelete((byte) 1);
				isDelete = goodTypeMapper.updateByPrimaryKeySelective(goodtype);
				if (isDelete == 0) {
					return isDelete;
				}
			}
		}
		return isDelete;
	}

	
}
