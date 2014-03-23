package cn.ly.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import cn.ly.dao.i.PFDeptMapper;
import cn.ly.dao.i.PFEvaluageMapper;
import cn.ly.dao.i.PFGradeMapper;
import cn.ly.dao.i.PFUserMapper;
import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFEvaluage;
import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFUser;
import cn.ly.pojo.PFUserExample;
import cn.ly.pojo.ViewGrade;
import cn.ly.service.BaseService;
import cn.ly.service.i.ArcService;

@Service("arcServcieImpl")
public class ArcServcieImpl extends BaseService implements ArcService {
	public List<PFUser> listAllUser() {
		return pFUserMapper.getAllUserList();
	}
	
	public PFUser getSingleUserDid(Integer userDid){
		return pFUserMapper.selectByPrimaryKey(userDid);
	}

	public PFUser getSingleUserCode(String uusercode) {
		PFUserExample userEx = new PFUserExample();
		userEx.createCriteria().andUusercodeEqualTo(uusercode);
		List<PFUser> results = pFUserMapper.selectByExample(userEx);
		if (results.size() == 1) {
			return results.get(0);
		} else if (results.size() > 1) {
			throw new RuntimeException("Query return " + results.size() + " results instead of max 1,usercode重复了");
		}
		return null;
	}
	
	public PFDept getDeptByDid(Integer did){
		return pFDeptMapper.selectByPrimaryKey(did);
	}

	public Integer getADeptUserNum(Integer bmflag , PFUser user){
		return pFUserMapper.onDeptUserNum(bmflag , user.getDid());
	}
	public Integer getHasPfNum(PFUser user){
		return pFUserMapper.getHasPfNum(quarter, user.getDid());
	}
	
	public List<PFGrade> getHasBePfList(PFUser user){
		return pFUserMapper.getHasPfUserList(user.getUusercode() , quarter);
	}
	
	public List<PFUser> getNoBePfList(PFUser user , PFDept dept){
		return pFUserMapper.getNoBePfList(dept.getBmflag(), user.getDid(), quarter);
	}
	
	public Integer saveGrade(PFGrade grade){
		return pFGradeMapper.insertSelective(grade);
		
	}
	public List<ViewGrade> getTotalGrade() {
		List<ViewGrade> vgList = new ArrayList<ViewGrade>();
		List<Map<String, Object>> gradeList = pFUserMapper.getTotalPersonGrade(quarter); 
		PFDept dept = null;
		PFUser user = null;
		ViewGrade vg = null;
		for (Map<String, Object> map : gradeList) {
			try {
				user = getSingleUserCode(MapUtils.getString(map, "BOPERUSERCODE"));
				dept = pFDeptMapper.selectByPrimaryKey(user.getPid());
				
				Float totalCount = MapUtils.getFloat(map, "TACCOUNT");//总分
				Integer personNum = MapUtils.getInteger(map, "TCOUNT");//总打分人数
				
				vg = new ViewGrade();
				vg.setBeOperUserDepDid(dept.getDid());
				vg.setBeOperUserDepName(dept.getDname());
				vg.setBoperusercode(user.getUusercode());
				vg.setBoperuserdid(user.getDid());
				vg.setBoperusername(user.getUusername());
				
				vg.setTotalAverage(totalCount/personNum);//全部人员打分平均分
				vg.setTotalCount(totalCount);//全部 总成绩
				vg.setTotalPersons(personNum);//全部 人数
				
				Map<String , Object> zzMap = getLevelCountMap(user.getUusercode(), 1, dept.getBmflag());
				if(zzMap == null){
					vg.setZzAverage(0f);//副职 平局分
					vg.setZzCount(0f);//副职总成绩
					vg.setZzPersons(0);//副职人数
				}else{
					Float zzTotalCount = MapUtils.getFloat(zzMap, "SUMCOUNT");//正职总分
					Integer zzPersonNum = MapUtils.getInteger(zzMap, "PERSONNUM");//正职总打分人数
					vg.setZzAverage(zzTotalCount/zzPersonNum);//正职 平均分
					vg.setZzCount(zzTotalCount);//正职 总成绩
					vg.setZzPersons(zzPersonNum);//正职 人数
				}
				
				Map<String , Object> fzMap = getLevelCountMap(user.getUusercode(), 2, dept.getBmflag());
				if(fzMap == null){
					vg.setFzAverage(0f);//副职 平局分
					vg.setFzCount(0f);//副职总成绩
					vg.setFzPersons(0);//副职人数
				}else{
					Float fzTotalCount = MapUtils.getFloat(fzMap, "SUMCOUNT");//副职总分
					Integer fzPersonNum = MapUtils.getInteger(fzMap, "PERSONNUM");//副职总打分人数
					vg.setFzAverage(fzTotalCount/fzPersonNum);//副职 平局分
					vg.setFzCount(fzTotalCount);//副职总成绩
					vg.setFzPersons(fzPersonNum);//副职人数
				}
				
				Map<String , Object> nsMap = getLevelCountMap(user.getUusercode(), 6, dept.getBmflag());
				if(nsMap == null){
					vg.setZsbmMgrAverage(0f);//内设部门管理员 平均分
					vg.setZsbmMgrCount(0f);//内设部门管理员 总成绩
					vg.setZsbmMgrPersons(0);//内设部门管理员 人数
				}else{
					Float nsTotalCount = MapUtils.getFloat(nsMap, "SUMCOUNT");//内设管理机构总分
					Integer nsPersonNum = MapUtils.getInteger(nsMap, "PERSONNUM");//内设管理机构总打分人数
					vg.setZsbmMgrAverage(nsTotalCount/nsPersonNum);//内设部门管理员 平均分
					vg.setZsbmMgrCount(nsTotalCount);//内设部门管理员 总成绩
					vg.setZsbmMgrPersons(nsPersonNum);//内设部门管理员 人数
				}
				
				Map<String , Object> ptMap = getLevelCountMap(user.getUusercode(), 3, dept.getBmflag());
				if(ptMap == null){
					vg.setPtryAverage(0f);//普通人员打分平均分
					vg.setPtryCount(0f);////普通人员 总成绩
					vg.setPtryPersons(0);////普通人 人数
				}else{
					Float ptTotalCount = MapUtils.getFloat(ptMap, "SUMCOUNT");//普通人员总分
					Integer ptPersonNum = MapUtils.getInteger(ptMap, "PERSONNUM");//普通人员总打分人数
					vg.setPtryAverage(ptTotalCount/ptPersonNum);//普通人员打分平均分
					vg.setPtryCount(ptTotalCount);////普通人员 总成绩
					vg.setPtryPersons(ptPersonNum);////普通人 人数
				}

				vgList.add(vg);
			} catch (Exception e) {
				log.error(e.getMessage() , e);
			}finally{
				dept = null;
				user = null;
				vg = null;
			}
		}
		return vgList;
	}
	
	public Map<String, String> getMapBySqlReturnIntStr(String sql,
			String col1, String col2) {
		return super.quert2Colum4Map(sql, col1, col2);
	}

	public Integer insertPfEvaluate(PFEvaluage evalue) {
		return pFEvaluageMapper.insertSelective(evalue);
	}

	public List<PFEvaluage> getBePfDetail(String boperusercode , String operusercode , Byte quarter) {
		return pFEvaluageMapper.getBePfDetail(boperusercode , operusercode , quarter);
	}
	
	public Map<String, Object> getLevelCountMap(String boperUserCode , Integer level , Integer bmflag){
		String sql = "SELECT BOPERUSERCODE , COUNT(BOPERUSERCODE) PERSONNUM, SUM(TACCOUNT) SUMCOUNT "
				+ "FROM PF_GRADE WHERE BOPERUSERCODE='"+boperUserCode+"' AND OPERUSERCODE IN(SELECT UUSERCODE FROM PF_USER WHERE ULEVEL="
				+ level + " AND PID IN (SELECT DID FROM PF_DEPT WHERE BMFLAG=" + bmflag +")) GROUP BY BOPERUSERCODE";
		return super.queryForMap(sql);	
	}
	
	//当前季度
	@Autowired
	@Value("${pf.opert.quarter}")
	private Byte quarter;
	
	@Autowired
	private PFUserMapper pFUserMapper;
	@Autowired
	private PFDeptMapper pFDeptMapper;
	@Autowired
	private PFGradeMapper pFGradeMapper;
	@Autowired
	private PFEvaluageMapper pFEvaluageMapper;
	
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
