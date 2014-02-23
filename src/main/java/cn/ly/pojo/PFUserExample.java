package cn.ly.pojo;

import java.util.ArrayList;
import java.util.List;

public class PFUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PFUserExample() {
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

        public Criteria andUusercodeIsNull() {
            addCriterion("uusercode is null");
            return (Criteria) this;
        }

        public Criteria andUusercodeIsNotNull() {
            addCriterion("uusercode is not null");
            return (Criteria) this;
        }

        public Criteria andUusercodeEqualTo(String value) {
            addCriterion("uusercode =", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeNotEqualTo(String value) {
            addCriterion("uusercode <>", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeGreaterThan(String value) {
            addCriterion("uusercode >", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeGreaterThanOrEqualTo(String value) {
            addCriterion("uusercode >=", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeLessThan(String value) {
            addCriterion("uusercode <", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeLessThanOrEqualTo(String value) {
            addCriterion("uusercode <=", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeLike(String value) {
            addCriterion("uusercode like", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeNotLike(String value) {
            addCriterion("uusercode not like", value, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeIn(List<String> values) {
            addCriterion("uusercode in", values, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeNotIn(List<String> values) {
            addCriterion("uusercode not in", values, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeBetween(String value1, String value2) {
            addCriterion("uusercode between", value1, value2, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusercodeNotBetween(String value1, String value2) {
            addCriterion("uusercode not between", value1, value2, "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusernameIsNull() {
            addCriterion("uusername is null");
            return (Criteria) this;
        }

        public Criteria andUusernameIsNotNull() {
            addCriterion("uusername is not null");
            return (Criteria) this;
        }

        public Criteria andUusernameEqualTo(String value) {
            addCriterion("uusername =", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotEqualTo(String value) {
            addCriterion("uusername <>", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThan(String value) {
            addCriterion("uusername >", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThanOrEqualTo(String value) {
            addCriterion("uusername >=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThan(String value) {
            addCriterion("uusername <", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThanOrEqualTo(String value) {
            addCriterion("uusername <=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLike(String value) {
            addCriterion("uusername like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotLike(String value) {
            addCriterion("uusername not like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameIn(List<String> values) {
            addCriterion("uusername in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotIn(List<String> values) {
            addCriterion("uusername not in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameBetween(String value1, String value2) {
            addCriterion("uusername between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotBetween(String value1, String value2) {
            addCriterion("uusername not between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
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

        public Criteria andUlevelIsNull() {
            addCriterion("ulevel is null");
            return (Criteria) this;
        }

        public Criteria andUlevelIsNotNull() {
            addCriterion("ulevel is not null");
            return (Criteria) this;
        }

        public Criteria andUlevelEqualTo(Byte value) {
            addCriterion("ulevel =", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotEqualTo(Byte value) {
            addCriterion("ulevel <>", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThan(Byte value) {
            addCriterion("ulevel >", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ulevel >=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThan(Byte value) {
            addCriterion("ulevel <", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThanOrEqualTo(Byte value) {
            addCriterion("ulevel <=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelIn(List<Byte> values) {
            addCriterion("ulevel in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotIn(List<Byte> values) {
            addCriterion("ulevel not in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelBetween(Byte value1, Byte value2) {
            addCriterion("ulevel between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotBetween(Byte value1, Byte value2) {
            addCriterion("ulevel not between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelnameIsNull() {
            addCriterion("ulevelname is null");
            return (Criteria) this;
        }

        public Criteria andUlevelnameIsNotNull() {
            addCriterion("ulevelname is not null");
            return (Criteria) this;
        }

        public Criteria andUlevelnameEqualTo(String value) {
            addCriterion("ulevelname =", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameNotEqualTo(String value) {
            addCriterion("ulevelname <>", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameGreaterThan(String value) {
            addCriterion("ulevelname >", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("ulevelname >=", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameLessThan(String value) {
            addCriterion("ulevelname <", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameLessThanOrEqualTo(String value) {
            addCriterion("ulevelname <=", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameLike(String value) {
            addCriterion("ulevelname like", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameNotLike(String value) {
            addCriterion("ulevelname not like", value, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameIn(List<String> values) {
            addCriterion("ulevelname in", values, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameNotIn(List<String> values) {
            addCriterion("ulevelname not in", values, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameBetween(String value1, String value2) {
            addCriterion("ulevelname between", value1, value2, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUlevelnameNotBetween(String value1, String value2) {
            addCriterion("ulevelname not between", value1, value2, "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUblevelIsNull() {
            addCriterion("ublevel is null");
            return (Criteria) this;
        }

        public Criteria andUblevelIsNotNull() {
            addCriterion("ublevel is not null");
            return (Criteria) this;
        }

        public Criteria andUblevelEqualTo(Byte value) {
            addCriterion("ublevel =", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotEqualTo(Byte value) {
            addCriterion("ublevel <>", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelGreaterThan(Byte value) {
            addCriterion("ublevel >", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ublevel >=", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelLessThan(Byte value) {
            addCriterion("ublevel <", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelLessThanOrEqualTo(Byte value) {
            addCriterion("ublevel <=", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelIn(List<Byte> values) {
            addCriterion("ublevel in", values, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotIn(List<Byte> values) {
            addCriterion("ublevel not in", values, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelBetween(Byte value1, Byte value2) {
            addCriterion("ublevel between", value1, value2, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotBetween(Byte value1, Byte value2) {
            addCriterion("ublevel not between", value1, value2, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelnameIsNull() {
            addCriterion("ublevelname is null");
            return (Criteria) this;
        }

        public Criteria andUblevelnameIsNotNull() {
            addCriterion("ublevelname is not null");
            return (Criteria) this;
        }

        public Criteria andUblevelnameEqualTo(String value) {
            addCriterion("ublevelname =", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameNotEqualTo(String value) {
            addCriterion("ublevelname <>", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameGreaterThan(String value) {
            addCriterion("ublevelname >", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameGreaterThanOrEqualTo(String value) {
            addCriterion("ublevelname >=", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameLessThan(String value) {
            addCriterion("ublevelname <", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameLessThanOrEqualTo(String value) {
            addCriterion("ublevelname <=", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameLike(String value) {
            addCriterion("ublevelname like", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameNotLike(String value) {
            addCriterion("ublevelname not like", value, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameIn(List<String> values) {
            addCriterion("ublevelname in", values, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameNotIn(List<String> values) {
            addCriterion("ublevelname not in", values, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameBetween(String value1, String value2) {
            addCriterion("ublevelname between", value1, value2, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUblevelnameNotBetween(String value1, String value2) {
            addCriterion("ublevelname not between", value1, value2, "ublevelname");
            return (Criteria) this;
        }

        public Criteria andUusercodeLikeInsensitive(String value) {
            addCriterion("upper(uusercode) like", value.toUpperCase(), "uusercode");
            return (Criteria) this;
        }

        public Criteria andUusernameLikeInsensitive(String value) {
            addCriterion("upper(uusername) like", value.toUpperCase(), "uusername");
            return (Criteria) this;
        }

        public Criteria andUpasswordLikeInsensitive(String value) {
            addCriterion("upper(upassword) like", value.toUpperCase(), "upassword");
            return (Criteria) this;
        }

        public Criteria andUlevelnameLikeInsensitive(String value) {
            addCriterion("upper(ulevelname) like", value.toUpperCase(), "ulevelname");
            return (Criteria) this;
        }

        public Criteria andUemailLikeInsensitive(String value) {
            addCriterion("upper(uemail) like", value.toUpperCase(), "uemail");
            return (Criteria) this;
        }

        public Criteria andUblevelnameLikeInsensitive(String value) {
            addCriterion("upper(ublevelname) like", value.toUpperCase(), "ublevelname");
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