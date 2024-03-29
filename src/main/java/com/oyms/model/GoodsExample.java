package com.oyms.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("goodName is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("goodName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("goodName =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("goodName <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("goodName >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodName >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("goodName <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("goodName <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("goodName like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("goodName not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("goodName in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("goodName not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("goodName between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("goodName not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodtypeIsNull() {
            addCriterion("goodtype is null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeIsNotNull() {
            addCriterion("goodtype is not null");
            return (Criteria) this;
        }

        public Criteria andGoodtypeEqualTo(String value) {
            addCriterion("goodtype =", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeNotEqualTo(String value) {
            addCriterion("goodtype <>", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeGreaterThan(String value) {
            addCriterion("goodtype >", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("goodtype >=", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeLessThan(String value) {
            addCriterion("goodtype <", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeLessThanOrEqualTo(String value) {
            addCriterion("goodtype <=", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeLike(String value) {
            addCriterion("goodtype like", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeNotLike(String value) {
            addCriterion("goodtype not like", value, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeIn(List<String> values) {
            addCriterion("goodtype in", values, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeNotIn(List<String> values) {
            addCriterion("goodtype not in", values, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeBetween(String value1, String value2) {
            addCriterion("goodtype between", value1, value2, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodtypeNotBetween(String value1, String value2) {
            addCriterion("goodtype not between", value1, value2, "goodtype");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNull() {
            addCriterion("goodprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIsNotNull() {
            addCriterion("goodprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpriceEqualTo(Float value) {
            addCriterion("goodprice =", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotEqualTo(Float value) {
            addCriterion("goodprice <>", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThan(Float value) {
            addCriterion("goodprice >", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("goodprice >=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThan(Float value) {
            addCriterion("goodprice <", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceLessThanOrEqualTo(Float value) {
            addCriterion("goodprice <=", value, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceIn(List<Float> values) {
            addCriterion("goodprice in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotIn(List<Float> values) {
            addCriterion("goodprice not in", values, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceBetween(Float value1, Float value2) {
            addCriterion("goodprice between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodpriceNotBetween(Float value1, Float value2) {
            addCriterion("goodprice not between", value1, value2, "goodprice");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNull() {
            addCriterion("goodnum is null");
            return (Criteria) this;
        }

        public Criteria andGoodnumIsNotNull() {
            addCriterion("goodnum is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnumEqualTo(Long value) {
            addCriterion("goodnum =", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotEqualTo(Long value) {
            addCriterion("goodnum <>", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThan(Long value) {
            addCriterion("goodnum >", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumGreaterThanOrEqualTo(Long value) {
            addCriterion("goodnum >=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThan(Long value) {
            addCriterion("goodnum <", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumLessThanOrEqualTo(Long value) {
            addCriterion("goodnum <=", value, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumIn(List<Long> values) {
            addCriterion("goodnum in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotIn(List<Long> values) {
            addCriterion("goodnum not in", values, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumBetween(Long value1, Long value2) {
            addCriterion("goodnum between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGoodnumNotBetween(Long value1, Long value2) {
            addCriterion("goodnum not between", value1, value2, "goodnum");
            return (Criteria) this;
        }

        public Criteria andGooddescIsNull() {
            addCriterion("gooddesc is null");
            return (Criteria) this;
        }

        public Criteria andGooddescIsNotNull() {
            addCriterion("gooddesc is not null");
            return (Criteria) this;
        }

        public Criteria andGooddescEqualTo(String value) {
            addCriterion("gooddesc =", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescNotEqualTo(String value) {
            addCriterion("gooddesc <>", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescGreaterThan(String value) {
            addCriterion("gooddesc >", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescGreaterThanOrEqualTo(String value) {
            addCriterion("gooddesc >=", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescLessThan(String value) {
            addCriterion("gooddesc <", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescLessThanOrEqualTo(String value) {
            addCriterion("gooddesc <=", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescLike(String value) {
            addCriterion("gooddesc like", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescNotLike(String value) {
            addCriterion("gooddesc not like", value, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescIn(List<String> values) {
            addCriterion("gooddesc in", values, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescNotIn(List<String> values) {
            addCriterion("gooddesc not in", values, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescBetween(String value1, String value2) {
            addCriterion("gooddesc between", value1, value2, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGooddescNotBetween(String value1, String value2) {
            addCriterion("gooddesc not between", value1, value2, "gooddesc");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlIsNull() {
            addCriterion("goodImgUrl is null");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlIsNotNull() {
            addCriterion("goodImgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlEqualTo(String value) {
            addCriterion("goodImgUrl =", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlNotEqualTo(String value) {
            addCriterion("goodImgUrl <>", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlGreaterThan(String value) {
            addCriterion("goodImgUrl >", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("goodImgUrl >=", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlLessThan(String value) {
            addCriterion("goodImgUrl <", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlLessThanOrEqualTo(String value) {
            addCriterion("goodImgUrl <=", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlLike(String value) {
            addCriterion("goodImgUrl like", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlNotLike(String value) {
            addCriterion("goodImgUrl not like", value, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlIn(List<String> values) {
            addCriterion("goodImgUrl in", values, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlNotIn(List<String> values) {
            addCriterion("goodImgUrl not in", values, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlBetween(String value1, String value2) {
            addCriterion("goodImgUrl between", value1, value2, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andGoodimgurlNotBetween(String value1, String value2) {
            addCriterion("goodImgUrl not between", value1, value2, "goodimgurl");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Byte value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Byte value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Byte value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Byte value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Byte value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Byte> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Byte> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Byte value1, Byte value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 28 16:48:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table goods
     *
     * @mbg.generated Mon Oct 28 16:48:09 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}