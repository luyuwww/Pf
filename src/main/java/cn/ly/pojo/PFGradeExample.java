package cn.ly.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PFGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PFGradeExample() {
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

        public Criteria andOperusercodeIsNull() {
            addCriterion("operusercode is null");
            return (Criteria) this;
        }

        public Criteria andOperusercodeIsNotNull() {
            addCriterion("operusercode is not null");
            return (Criteria) this;
        }

        public Criteria andOperusercodeEqualTo(String value) {
            addCriterion("operusercode =", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeNotEqualTo(String value) {
            addCriterion("operusercode <>", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeGreaterThan(String value) {
            addCriterion("operusercode >", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeGreaterThanOrEqualTo(String value) {
            addCriterion("operusercode >=", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeLessThan(String value) {
            addCriterion("operusercode <", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeLessThanOrEqualTo(String value) {
            addCriterion("operusercode <=", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeLike(String value) {
            addCriterion("operusercode like", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeNotLike(String value) {
            addCriterion("operusercode not like", value, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeIn(List<String> values) {
            addCriterion("operusercode in", values, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeNotIn(List<String> values) {
            addCriterion("operusercode not in", values, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeBetween(String value1, String value2) {
            addCriterion("operusercode between", value1, value2, "operusercode");
            return (Criteria) this;
        }

        public Criteria andOperusercodeNotBetween(String value1, String value2) {
            addCriterion("operusercode not between", value1, value2, "operusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeIsNull() {
            addCriterion("boperusercode is null");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeIsNotNull() {
            addCriterion("boperusercode is not null");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeEqualTo(String value) {
            addCriterion("boperusercode =", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeNotEqualTo(String value) {
            addCriterion("boperusercode <>", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeGreaterThan(String value) {
            addCriterion("boperusercode >", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeGreaterThanOrEqualTo(String value) {
            addCriterion("boperusercode >=", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeLessThan(String value) {
            addCriterion("boperusercode <", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeLessThanOrEqualTo(String value) {
            addCriterion("boperusercode <=", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeLike(String value) {
            addCriterion("boperusercode like", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeNotLike(String value) {
            addCriterion("boperusercode not like", value, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeIn(List<String> values) {
            addCriterion("boperusercode in", values, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeNotIn(List<String> values) {
            addCriterion("boperusercode not in", values, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeBetween(String value1, String value2) {
            addCriterion("boperusercode between", value1, value2, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeNotBetween(String value1, String value2) {
            addCriterion("boperusercode not between", value1, value2, "boperusercode");
            return (Criteria) this;
        }

        public Criteria andOpertiimeIsNull() {
            addCriterion("opertiime is null");
            return (Criteria) this;
        }

        public Criteria andOpertiimeIsNotNull() {
            addCriterion("opertiime is not null");
            return (Criteria) this;
        }

        public Criteria andOpertiimeEqualTo(Date value) {
            addCriterion("opertiime =", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeNotEqualTo(Date value) {
            addCriterion("opertiime <>", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeGreaterThan(Date value) {
            addCriterion("opertiime >", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opertiime >=", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeLessThan(Date value) {
            addCriterion("opertiime <", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeLessThanOrEqualTo(Date value) {
            addCriterion("opertiime <=", value, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeIn(List<Date> values) {
            addCriterion("opertiime in", values, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeNotIn(List<Date> values) {
            addCriterion("opertiime not in", values, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeBetween(Date value1, Date value2) {
            addCriterion("opertiime between", value1, value2, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOpertiimeNotBetween(Date value1, Date value2) {
            addCriterion("opertiime not between", value1, value2, "opertiime");
            return (Criteria) this;
        }

        public Criteria andOperquarterIsNull() {
            addCriterion("operquarter is null");
            return (Criteria) this;
        }

        public Criteria andOperquarterIsNotNull() {
            addCriterion("operquarter is not null");
            return (Criteria) this;
        }

        public Criteria andOperquarterEqualTo(Byte value) {
            addCriterion("operquarter =", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterNotEqualTo(Byte value) {
            addCriterion("operquarter <>", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterGreaterThan(Byte value) {
            addCriterion("operquarter >", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterGreaterThanOrEqualTo(Byte value) {
            addCriterion("operquarter >=", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterLessThan(Byte value) {
            addCriterion("operquarter <", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterLessThanOrEqualTo(Byte value) {
            addCriterion("operquarter <=", value, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterIn(List<Byte> values) {
            addCriterion("operquarter in", values, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterNotIn(List<Byte> values) {
            addCriterion("operquarter not in", values, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterBetween(Byte value1, Byte value2) {
            addCriterion("operquarter between", value1, value2, "operquarter");
            return (Criteria) this;
        }

        public Criteria andOperquarterNotBetween(Byte value1, Byte value2) {
            addCriterion("operquarter not between", value1, value2, "operquarter");
            return (Criteria) this;
        }

        public Criteria andTaccountIsNull() {
            addCriterion("taccount is null");
            return (Criteria) this;
        }

        public Criteria andTaccountIsNotNull() {
            addCriterion("taccount is not null");
            return (Criteria) this;
        }

        public Criteria andTaccountEqualTo(BigDecimal value) {
            addCriterion("taccount =", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotEqualTo(BigDecimal value) {
            addCriterion("taccount <>", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountGreaterThan(BigDecimal value) {
            addCriterion("taccount >", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taccount >=", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountLessThan(BigDecimal value) {
            addCriterion("taccount <", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taccount <=", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountIn(List<BigDecimal> values) {
            addCriterion("taccount in", values, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotIn(List<BigDecimal> values) {
            addCriterion("taccount not in", values, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taccount between", value1, value2, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taccount not between", value1, value2, "taccount");
            return (Criteria) this;
        }

        public Criteria andIsokIsNull() {
            addCriterion("isok is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("isok is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(Byte value) {
            addCriterion("isok =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(Byte value) {
            addCriterion("isok <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(Byte value) {
            addCriterion("isok >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(Byte value) {
            addCriterion("isok >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(Byte value) {
            addCriterion("isok <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(Byte value) {
            addCriterion("isok <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<Byte> values) {
            addCriterion("isok in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<Byte> values) {
            addCriterion("isok not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(Byte value1, Byte value2) {
            addCriterion("isok between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(Byte value1, Byte value2) {
            addCriterion("isok not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andOperuserdidIsNull() {
            addCriterion("operuserdid is null");
            return (Criteria) this;
        }

        public Criteria andOperuserdidIsNotNull() {
            addCriterion("operuserdid is not null");
            return (Criteria) this;
        }

        public Criteria andOperuserdidEqualTo(Integer value) {
            addCriterion("operuserdid =", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidNotEqualTo(Integer value) {
            addCriterion("operuserdid <>", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidGreaterThan(Integer value) {
            addCriterion("operuserdid >", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("operuserdid >=", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidLessThan(Integer value) {
            addCriterion("operuserdid <", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidLessThanOrEqualTo(Integer value) {
            addCriterion("operuserdid <=", value, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidIn(List<Integer> values) {
            addCriterion("operuserdid in", values, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidNotIn(List<Integer> values) {
            addCriterion("operuserdid not in", values, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidBetween(Integer value1, Integer value2) {
            addCriterion("operuserdid between", value1, value2, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andOperuserdidNotBetween(Integer value1, Integer value2) {
            addCriterion("operuserdid not between", value1, value2, "operuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidIsNull() {
            addCriterion("boperuserdid is null");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidIsNotNull() {
            addCriterion("boperuserdid is not null");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidEqualTo(Integer value) {
            addCriterion("boperuserdid =", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidNotEqualTo(Integer value) {
            addCriterion("boperuserdid <>", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidGreaterThan(Integer value) {
            addCriterion("boperuserdid >", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("boperuserdid >=", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidLessThan(Integer value) {
            addCriterion("boperuserdid <", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidLessThanOrEqualTo(Integer value) {
            addCriterion("boperuserdid <=", value, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidIn(List<Integer> values) {
            addCriterion("boperuserdid in", values, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidNotIn(List<Integer> values) {
            addCriterion("boperuserdid not in", values, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidBetween(Integer value1, Integer value2) {
            addCriterion("boperuserdid between", value1, value2, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andBoperuserdidNotBetween(Integer value1, Integer value2) {
            addCriterion("boperuserdid not between", value1, value2, "boperuserdid");
            return (Criteria) this;
        }

        public Criteria andOperusernameIsNull() {
            addCriterion("operusername is null");
            return (Criteria) this;
        }

        public Criteria andOperusernameIsNotNull() {
            addCriterion("operusername is not null");
            return (Criteria) this;
        }

        public Criteria andOperusernameEqualTo(String value) {
            addCriterion("operusername =", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotEqualTo(String value) {
            addCriterion("operusername <>", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameGreaterThan(String value) {
            addCriterion("operusername >", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameGreaterThanOrEqualTo(String value) {
            addCriterion("operusername >=", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLessThan(String value) {
            addCriterion("operusername <", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLessThanOrEqualTo(String value) {
            addCriterion("operusername <=", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLike(String value) {
            addCriterion("operusername like", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotLike(String value) {
            addCriterion("operusername not like", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameIn(List<String> values) {
            addCriterion("operusername in", values, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotIn(List<String> values) {
            addCriterion("operusername not in", values, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameBetween(String value1, String value2) {
            addCriterion("operusername between", value1, value2, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotBetween(String value1, String value2) {
            addCriterion("operusername not between", value1, value2, "operusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameIsNull() {
            addCriterion("boperusername is null");
            return (Criteria) this;
        }

        public Criteria andBoperusernameIsNotNull() {
            addCriterion("boperusername is not null");
            return (Criteria) this;
        }

        public Criteria andBoperusernameEqualTo(String value) {
            addCriterion("boperusername =", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameNotEqualTo(String value) {
            addCriterion("boperusername <>", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameGreaterThan(String value) {
            addCriterion("boperusername >", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameGreaterThanOrEqualTo(String value) {
            addCriterion("boperusername >=", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameLessThan(String value) {
            addCriterion("boperusername <", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameLessThanOrEqualTo(String value) {
            addCriterion("boperusername <=", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameLike(String value) {
            addCriterion("boperusername like", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameNotLike(String value) {
            addCriterion("boperusername not like", value, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameIn(List<String> values) {
            addCriterion("boperusername in", values, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameNotIn(List<String> values) {
            addCriterion("boperusername not in", values, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameBetween(String value1, String value2) {
            addCriterion("boperusername between", value1, value2, "boperusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameNotBetween(String value1, String value2) {
            addCriterion("boperusername not between", value1, value2, "boperusername");
            return (Criteria) this;
        }

        public Criteria andOperusercodeLikeInsensitive(String value) {
            addCriterion("upper(operusercode) like", value.toUpperCase(), "operusercode");
            return (Criteria) this;
        }

        public Criteria andBoperusercodeLikeInsensitive(String value) {
            addCriterion("upper(boperusercode) like", value.toUpperCase(), "boperusercode");
            return (Criteria) this;
        }

        public Criteria andOperusernameLikeInsensitive(String value) {
            addCriterion("upper(operusername) like", value.toUpperCase(), "operusername");
            return (Criteria) this;
        }

        public Criteria andBoperusernameLikeInsensitive(String value) {
            addCriterion("upper(boperusername) like", value.toUpperCase(), "boperusername");
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