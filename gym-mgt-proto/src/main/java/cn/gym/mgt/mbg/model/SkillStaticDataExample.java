package cn.gym.mgt.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SkillStaticDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillStaticDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andSkillStaticDataIdIsNull() {
            addCriterion("skill_static_data_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdIsNotNull() {
            addCriterion("skill_static_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdEqualTo(Long value) {
            addCriterion("skill_static_data_id =", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdNotEqualTo(Long value) {
            addCriterion("skill_static_data_id <>", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdGreaterThan(Long value) {
            addCriterion("skill_static_data_id >", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("skill_static_data_id >=", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdLessThan(Long value) {
            addCriterion("skill_static_data_id <", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdLessThanOrEqualTo(Long value) {
            addCriterion("skill_static_data_id <=", value, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdIn(List<Long> values) {
            addCriterion("skill_static_data_id in", values, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdNotIn(List<Long> values) {
            addCriterion("skill_static_data_id not in", values, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdBetween(Long value1, Long value2) {
            addCriterion("skill_static_data_id between", value1, value2, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillStaticDataIdNotBetween(Long value1, Long value2) {
            addCriterion("skill_static_data_id not between", value1, value2, "skillStaticDataId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNull() {
            addCriterion("skill_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNotNull() {
            addCriterion("skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillIdEqualTo(Long value) {
            addCriterion("skill_id =", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotEqualTo(Long value) {
            addCriterion("skill_id <>", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThan(Long value) {
            addCriterion("skill_id >", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("skill_id >=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThan(Long value) {
            addCriterion("skill_id <", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThanOrEqualTo(Long value) {
            addCriterion("skill_id <=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIn(List<Long> values) {
            addCriterion("skill_id in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotIn(List<Long> values) {
            addCriterion("skill_id not in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdBetween(Long value1, Long value2) {
            addCriterion("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotBetween(Long value1, Long value2) {
            addCriterion("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdIsNull() {
            addCriterion("static_data_id is null");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdIsNotNull() {
            addCriterion("static_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdEqualTo(Long value) {
            addCriterion("static_data_id =", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdNotEqualTo(Long value) {
            addCriterion("static_data_id <>", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdGreaterThan(Long value) {
            addCriterion("static_data_id >", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("static_data_id >=", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdLessThan(Long value) {
            addCriterion("static_data_id <", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdLessThanOrEqualTo(Long value) {
            addCriterion("static_data_id <=", value, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdIn(List<Long> values) {
            addCriterion("static_data_id in", values, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdNotIn(List<Long> values) {
            addCriterion("static_data_id not in", values, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdBetween(Long value1, Long value2) {
            addCriterion("static_data_id between", value1, value2, "staticDataId");
            return (Criteria) this;
        }

        public Criteria andStaticDataIdNotBetween(Long value1, Long value2) {
            addCriterion("static_data_id not between", value1, value2, "staticDataId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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