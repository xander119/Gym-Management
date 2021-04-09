package cn.gym.mgt.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerMembershipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerMembershipExample() {
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

        public Criteria andCustomerMembershipIdIsNull() {
            addCriterion("customer_membership_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdIsNotNull() {
            addCriterion("customer_membership_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdEqualTo(Long value) {
            addCriterion("customer_membership_id =", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdNotEqualTo(Long value) {
            addCriterion("customer_membership_id <>", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdGreaterThan(Long value) {
            addCriterion("customer_membership_id >", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_membership_id >=", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdLessThan(Long value) {
            addCriterion("customer_membership_id <", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_membership_id <=", value, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdIn(List<Long> values) {
            addCriterion("customer_membership_id in", values, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdNotIn(List<Long> values) {
            addCriterion("customer_membership_id not in", values, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdBetween(Long value1, Long value2) {
            addCriterion("customer_membership_id between", value1, value2, "customerMembershipId");
            return (Criteria) this;
        }

        public Criteria andCustomerMembershipIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_membership_id not between", value1, value2, "customerMembershipId");
            return (Criteria) this;
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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