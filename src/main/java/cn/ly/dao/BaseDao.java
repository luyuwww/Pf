package cn.ly.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFUser;

@Repository
public interface BaseDao{
	/**
	 * 得到最大的did
	 */
	@Select("select max(did) from ${tableName}")
	Integer getMaxDid(@Param("tableName") String tableName);
	
	/**
	 * sqlserver得到数据库时间
	 */
	@Select("select getdate()")
	Date selectDateTimeForMSSQL();
	
	/**
	 * oracle得到数据库时间
	 */
	@Select("select SYSDATE from dual")
	Date selectDateTimeForOra();
	
	/**
	 * db2得到数据库时间
	 */
	@Select("select current timestamp from sysibm.sysdummy1")
	Date selectDateTimeForDB2();
	
	/**
	 * MySql得到数据库时间
	 */
	@Select("select now()")
	Date selectDateTimeForMySQL();
	
	/**
	 * h2得到数据库时间
	 */
	@Select("select CURRENT_TIMESTAMP")
	Date selectDateTimeForH2();
	
	/**
	 * copy表
	 * @param sName 源表
	 * @param tName 目标表
	 */
	@Insert("create table ${tName} as  (select * from ${sName})")
	void copyTable(@Param("sName") String sName , @Param("tName") String tName);
	@Insert("drop table ${tableName}")
	void dropTable(@Param("tableName") String tableName);
	
	/**
	 * <p>Title: 得到同一个打分级别的共有多少需要被打分,不包含uLEVEL==1的</p>
	 * @date 2014年2月26日
	*/
	@Select("SELECT COUNT(*) FROM PF_USER WHERE PID IN (SELECT DID FROM PF_DEPT WHERE BMFLAG=${bmflag}) AND ULEVEL <> 1 AND DID<>${userdid}")
	Integer onDeptUserNum(@Param("bmflag") Integer bmflag, @Param("userdid") Integer userdid);
	
	/**
	 * 查询本季度已经评分的人员 数量
	 */
	@Select("SELECT COUNT(*) FROM PF_GRADE WHERE OPERQUARTER=${quarter} AND OPERUSERDID=${userdid}")
	Integer getHasPfNum(@Param("quarter") Byte quarter , @Param("userdid") Integer userdid);
	
	/**
	 * <p>Title: 得到所有该user下同组没有被打分的 人,不包括正职(ULEVEL==1 不要)</p>
	*/
	@Select("SELECT * FROM PF_USER WHERE PID IN (SELECT DID FROM PF_DEPT WHERE BMFLAG=${bmflag}) AND ULEVEL <>1 AND DID<>${userdid} "
			+ "AND DID NOT IN (SELECT BOPERUSERDID FROM PF_GRADE WHERE OPERUSERDID=${userdid} AND OPERQUARTER=${quarter})")
	List<PFUser> getNoBePfList(@Param("bmflag") Integer bmflag , @Param("userdid") Integer userdid , @Param("quarter")Byte quarter);
	
	/**
	 * <p>Title: 得到已经评分的userlist</p>
	*/
	@Select("SELECT * FROM PF_USER WHERE DID IN (SELECT BOPERUSERDID FROM PF_GRADE WHERE OPERQUARTER=${quarter} AND OPERUSERDID=${userdid})")
	List<PFUser> getHasPfUserList(@Param("quarter") Byte quarter , @Param("userdid") Integer userdid);
	
    /**
     * <p>Title: 得到所有人的成绩</p>
     * <p>Description: </p>
     * @date 2014年3月3日
    */
    @Select("SELECT BOPERUSERCODE ,BOPERUSERNAME ,SUM(TACCOUNT) TACCOUNT FROM PF_GRADE GROUP BY"
    		+ " BOPERUSERCODE ,BOPERUSERNAME ORDER BY BOPERUSERCODE")
    List<PFGrade> getTotalPersonGrade();
}
