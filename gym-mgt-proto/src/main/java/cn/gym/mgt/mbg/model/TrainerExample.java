package cn.gym.mgt.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TrainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainerExample() {
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

        public Criteria andTrainerIdIsNull() {
            addCriterion("trainer_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainerIdIsNotNull() {
            addCriterion("trainer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerIdEqualTo(Long value) {
            addCriterion("trainer_id =", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotEqualTo(Long value) {
            addCriterion("trainer_id <>", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdGreaterThan(Long value) {
            addCriterion("trainer_id >", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trainer_id >=", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdLessThan(Long value) {
            addCriterion("trainer_id <", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdLessThanOrEqualTo(Long value) {
            addCriterion("trainer_id <=", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdIn(List<Long> values) {
            addCriterion("trainer_id in", values, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotIn(List<Long> values) {
            addCriterion("trainer_id not in", values, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdBetween(Long value1, Long value2) {
            addCriterion("trainer_id between", value1, value2, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotBetween(Long value1, Long value2) {
            addCriterion("trainer_id not between", value1, value2, "trainerId");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Integer value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Integer value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Integer value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Integer value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Integer> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Integer> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Integer value1, Integer value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdIsNull() {
            addCriterion("security_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdIsNotNull() {
            addCriterion("security_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdEqualTo(Long value) {
            addCriterion("security_user_id =", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdNotEqualTo(Long value) {
            addCriterion("security_user_id <>", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdGreaterThan(Long value) {
            addCriterion("security_user_id >", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("security_user_id >=", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdLessThan(Long value) {
            addCriterion("security_user_id <", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdLessThanOrEqualTo(Long value) {
            addCriterion("security_user_id <=", value, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdIn(List<Long> values) {
            addCriterion("security_user_id in", values, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdNotIn(List<Long> values) {
            addCriterion("security_user_id not in", values, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdBetween(Long value1, Long value2) {
            addCriterion("security_user_id between", value1, value2, "securityUserId");
            return (Criteria) this;
        }

        public Criteria andSecurityUserIdNotBetween(Long value1, Long value2) {
            addCriterion("security_user_id not between", value1, value2, "securityUserId");
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