package cn.ly.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PFEvaluageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PFEvaluageExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andThemeanIsNull() {
            addCriterion("themean is null");
            return (Criteria) this;
        }

        public Criteria andThemeanIsNotNull() {
            addCriterion("themean is not null");
            return (Criteria) this;
        }

        public Criteria andThemeanEqualTo(String value) {
            addCriterion("themean =", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanNotEqualTo(String value) {
            addCriterion("themean <>", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanGreaterThan(String value) {
            addCriterion("themean >", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanGreaterThanOrEqualTo(String value) {
            addCriterion("themean >=", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanLessThan(String value) {
            addCriterion("themean <", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanLessThanOrEqualTo(String value) {
            addCriterion("themean <=", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanLike(String value) {
            addCriterion("themean like", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanNotLike(String value) {
            addCriterion("themean not like", value, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanIn(List<String> values) {
            addCriterion("themean in", values, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanNotIn(List<String> values) {
            addCriterion("themean not in", values, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanBetween(String value1, String value2) {
            addCriterion("themean between", value1, value2, "themean");
            return (Criteria) this;
        }

        public Criteria andThemeanNotBetween(String value1, String value2) {
            addCriterion("themean not between", value1, value2, "themean");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeIsNull() {
            addCriterion("n_maxgrade is null");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeIsNotNull() {
            addCriterion("n_maxgrade is not null");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeEqualTo(BigDecimal value) {
            addCriterion("n_maxgrade =", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeNotEqualTo(BigDecimal value) {
            addCriterion("n_maxgrade <>", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeGreaterThan(BigDecimal value) {
            addCriterion("n_maxgrade >", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("n_maxgrade >=", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeLessThan(BigDecimal value) {
            addCriterion("n_maxgrade <", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("n_maxgrade <=", value, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeIn(List<BigDecimal> values) {
            addCriterion("n_maxgrade in", values, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeNotIn(List<BigDecimal> values) {
            addCriterion("n_maxgrade not in", values, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_maxgrade between", value1, value2, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andNMaxgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_maxgrade not between", value1, value2, "nMaxgrade");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andThecountIsNull() {
            addCriterion("thecount is null");
            return (Criteria) this;
        }

        public Criteria andThecountIsNotNull() {
            addCriterion("thecount is not null");
            return (Criteria) this;
        }

        public Criteria andThecountEqualTo(BigDecimal value) {
            addCriterion("thecount =", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountNotEqualTo(BigDecimal value) {
            addCriterion("thecount <>", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountGreaterThan(BigDecimal value) {
            addCriterion("thecount >", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("thecount >=", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountLessThan(BigDecimal value) {
            addCriterion("thecount <", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("thecount <=", value, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountIn(List<BigDecimal> values) {
            addCriterion("thecount in", values, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountNotIn(List<BigDecimal> values) {
            addCriterion("thecount not in", values, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thecount between", value1, value2, "thecount");
            return (Criteria) this;
        }

        public Criteria andThecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thecount not between", value1, value2, "thecount");
            return (Criteria) this;
        }

        public Criteria andThemeanLikeInsensitive(String value) {
            addCriterion("upper(themean) like", value.toUpperCase(), "themean");
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