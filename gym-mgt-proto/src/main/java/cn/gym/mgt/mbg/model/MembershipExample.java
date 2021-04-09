package cn.gym.mgt.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MembershipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MembershipExample() {
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

        public Criteria andMembershipIdIsNull() {
            addCriterion("membership_id is null");
            return (Criteria) this;
        }

        public Criteria andMembershipIdIsNotNull() {
            addCriterion("membership_id is not null");
            return (Criteria) this;
        }

        public Criteria andMembershipIdEqualTo(Long value) {
            addCriterion("membership_id =", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdNotEqualTo(Long value) {
            addCriterion("membership_id <>", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdGreaterThan(Long value) {
            addCriterion("membership_id >", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("membership_id >=", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdLessThan(Long value) {
            addCriterion("membership_id <", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdLessThanOrEqualTo(Long value) {
            addCriterion("membership_id <=", value, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdIn(List<Long> values) {
            addCriterion("membership_id in", values, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdNotIn(List<Long> values) {
            addCriterion("membership_id not in", values, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdBetween(Long value1, Long value2) {
            addCriterion("membership_id between", value1, value2, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipIdNotBetween(Long value1, Long value2) {
            addCriterion("membership_id not between", value1, value2, "membershipId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdIsNull() {
            addCriterion("membership_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdIsNotNull() {
            addCriterion("membership_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdEqualTo(Long value) {
            addCriterion("membership_type_id =", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdNotEqualTo(Long value) {
            addCriterion("membership_type_id <>", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdGreaterThan(Long value) {
            addCriterion("membership_type_id >", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("membership_type_id >=", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdLessThan(Long value) {
            addCriterion("membership_type_id <", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("membership_type_id <=", value, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdIn(List<Long> values) {
            addCriterion("membership_type_id in", values, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdNotIn(List<Long> values) {
            addCriterion("membership_type_id not in", values, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdBetween(Long value1, Long value2) {
            addCriterion("membership_type_id between", value1, value2, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andMembershipTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("membership_type_id not between", value1, value2, "membershipTypeId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andMembershipProductIsNull() {
            addCriterion("membership_product is null");
            return (Criteria) this;
        }

        public Criteria andMembershipProductIsNotNull() {
            addCriterion("membership_product is not null");
            return (Criteria) this;
        }

        public Criteria andMembershipProductEqualTo(Long value) {
            addCriterion("membership_product =", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductNotEqualTo(Long value) {
            addCriterion("membership_product <>", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductGreaterThan(Long value) {
            addCriterion("membership_product >", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductGreaterThanOrEqualTo(Long value) {
            addCriterion("membership_product >=", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductLessThan(Long value) {
            addCriterion("membership_product <", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductLessThanOrEqualTo(Long value) {
            addCriterion("membership_product <=", value, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductIn(List<Long> values) {
            addCriterion("membership_product in", values, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductNotIn(List<Long> values) {
            addCriterion("membership_product not in", values, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductBetween(Long value1, Long value2) {
            addCriterion("membership_product between", value1, value2, "membershipProduct");
            return (Criteria) this;
        }

        public Criteria andMembershipProductNotBetween(Long value1, Long value2) {
            addCriterion("membership_product not between", value1, value2, "membershipProduct");
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