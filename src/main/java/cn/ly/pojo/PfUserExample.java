package cn.ly.pojo;

import java.util.ArrayList;
import java.util.List;

public class PfUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PfUserExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andDepidIsNull() {
            addCriterion("depid is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("depid is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(Integer value) {
            addCriterion("depid =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(Integer value) {
            addCriterion("depid <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(Integer value) {
            addCriterion("depid >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("depid >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(Integer value) {
            addCriterion("depid <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(Integer value) {
            addCriterion("depid <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<Integer> values) {
            addCriterion("depid in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<Integer> values) {
            addCriterion("depid not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(Integer value1, Integer value2) {
            addCriterion("depid between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(Integer value1, Integer value2) {
            addCriterion("depid not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNull() {
            addCriterion("depname is null");
            return (Criteria) this;
        }

        public Criteria andDepnameIsNotNull() {
            addCriterion("depname is not null");
            return (Criteria) this;
        }

        public Criteria andDepnameEqualTo(String value) {
            addCriterion("depname =", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotEqualTo(String value) {
            addCriterion("depname <>", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThan(String value) {
            addCriterion("depname >", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameGreaterThanOrEqualTo(String value) {
            addCriterion("depname >=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThan(String value) {
            addCriterion("depname <", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLessThanOrEqualTo(String value) {
            addCriterion("depname <=", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameLike(String value) {
            addCriterion("depname like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotLike(String value) {
            addCriterion("depname not like", value, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameIn(List<String> values) {
            addCriterion("depname in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotIn(List<String> values) {
            addCriterion("depname not in", values, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameBetween(String value1, String value2) {
            addCriterion("depname between", value1, value2, "depname");
            return (Criteria) this;
        }

        public Criteria andDepnameNotBetween(String value1, String value2) {
            addCriterion("depname not between", value1, value2, "depname");
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

        public Criteria andUlevelEqualTo(Integer value) {
            addCriterion("ulevel =", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotEqualTo(Integer value) {
            addCriterion("ulevel <>", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThan(Integer value) {
            addCriterion("ulevel >", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ulevel >=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThan(Integer value) {
            addCriterion("ulevel <", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThanOrEqualTo(Integer value) {
            addCriterion("ulevel <=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelIn(List<Integer> values) {
            addCriterion("ulevel in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotIn(List<Integer> values) {
            addCriterion("ulevel not in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelBetween(Integer value1, Integer value2) {
            addCriterion("ulevel between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUblevelEqualTo(Integer value) {
            addCriterion("ublevel =", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotEqualTo(Integer value) {
            addCriterion("ublevel <>", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelGreaterThan(Integer value) {
            addCriterion("ublevel >", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ublevel >=", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelLessThan(Integer value) {
            addCriterion("ublevel <", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelLessThanOrEqualTo(Integer value) {
            addCriterion("ublevel <=", value, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelIn(List<Integer> values) {
            addCriterion("ublevel in", values, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotIn(List<Integer> values) {
            addCriterion("ublevel not in", values, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelBetween(Integer value1, Integer value2) {
            addCriterion("ublevel between", value1, value2, "ublevel");
            return (Criteria) this;
        }

        public Criteria andUblevelNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUpasswordLikeInsensitive(String value) {
            addCriterion("upper(upassword) like", value.toUpperCase(), "upassword");
            return (Criteria) this;
        }

        public Criteria andUusernameLikeInsensitive(String value) {
            addCriterion("upper(uusername) like", value.toUpperCase(), "uusername");
            return (Criteria) this;
        }

        public Criteria andDepnameLikeInsensitive(String value) {
            addCriterion("upper(depname) like", value.toUpperCase(), "depname");
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