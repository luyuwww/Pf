package cn.ly.service;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.RuntimeSqlException;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import cn.ly.dao.JdbcDao;
import cn.ly.util.DateUtil;
import cn.ly.util.GlobalFinalAttr.DatabaseType;

@Service
public class BaseService {
	
	
	protected String generateTimeToSQLDate(Object date){
		String datevalue = null;
		String typeStr = getDBTyeStr();
		TimeZone.setDefault(TimeZone.getTimeZone("ETC/GMT-8"));  //设置时区 中国/北京/香港
		if(date instanceof Date){
			datevalue = DateUtil.getDateTimeFormat().format(date);
		}else if(date instanceof String){
			datevalue = (String)date;
		}
		if(StringUtils.isNotEmpty(typeStr)){
			if(typeStr!=null&&typeStr.equals("Microsoft SQL Server")){
				datevalue = "cast('" + datevalue + "' as datetime)";
			}else if(typeStr!=null&&typeStr.equals("Oracle")){
				if(datevalue.indexOf(".")>-1){//防止出现 2056-12-25 00:00:00.0 而无法导入
					datevalue = datevalue.substring(0, datevalue.lastIndexOf("."));
				}
				datevalue = "TO_DATE('"+datevalue+"', 'yyyy-MM-dd HH24:mi:ss')";
			}else if(typeStr!=null&&typeStr.equals("Db2")){
				datevalue = "TIMESTAMP('" + datevalue + "' )";
			}else if(typeStr!=null&&typeStr.equals("MySQL")){
				datevalue =  "DATE_FORMAT('"+datevalue+"', '%Y-%m-%d %H:%i:%s')";
			}else if(typeStr!=null&&typeStr.equals("H2")){
				datevalue = "PARSEDATETIME('" + datevalue + "'，'dd-MM-yyyy hh:mm:ss.SS' )";
			}else{
				datevalue = "";
				log.error("DB Type not funder!");
			}
		}else{
			datevalue = "";
			log.error("get database time is error!");
		}
		return datevalue;
	}
	
	
	/**
	 * 得到数据库的类型str
	 */
	protected String getDBTyeStr() throws RuntimeSqlException {
		String typeStr = null;
		TimeZone.setDefault(TimeZone.getTimeZone("ETC/GMT-8"));  //设置时区 中国/北京/香港
		Connection conn = null;
		DatabaseMetaData dbmd = null;
		try {
			conn = jdbcDao.getConn();
			dbmd = conn.getMetaData();
			typeStr = dbmd.getDatabaseProductName();
		} catch (Exception e) {
			log.error("get database type is error!" , e);
		}finally{
			try {
				dbmd = null;
				conn.close();
			} catch (SQLException exx) {
				log.error(exx.getMessage());
			}
		}
		return typeStr;
	}
	
	/**
	 * 得到数据库类型的 DatabaseType
	 */
	protected DatabaseType getDatabaseType(){
		DatabaseType databaseType = null;
		try {
			databaseType = DatabaseType.getDatabaseType(getDBTyeStr());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return databaseType;
	}
	
	/**
	 * 根据表名判断数据表是否存在
	 */
	protected Boolean existTable(String tablename){
		boolean result = false;
		Connection conn = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		try {
			conn = jdbcDao.getConn();
			dbmd = conn.getMetaData();
			String schemaName = getSchemaName(dbmd);
			rs = dbmd.getTables(null , schemaName ,  tablename, new String[]{"TABLE"});
			if(rs.next()){
				result = true;
			}
		}catch(Exception ex){
			log.error(ex.getMessage());
		}finally{
			try {
				dbmd = null;
				rs.close();
				conn.close();
			} catch (SQLException e) {
				log.error("获取ConnectionMetaData关闭链接错误!");
			}
		}
		return result;
	}
	
	/**
	 * 判断表的字段是否存在
	 */
	protected boolean existColumn(String tablename,String columnName){
		return existColumnOrIndex(tablename, columnName, true);
	}
	/**
	 * 判断字段的索引是否存在
	 */
	protected boolean existIndex(String tablename,String indexName){
		
		return existColumnOrIndex(tablename, indexName, false);
	}
	
	protected Map<String, Object> queryForMap(String sql){
		return jdbcDao.queryForMap(sql);
	}
	protected List<Map<String, Object>> quertListMap(String sql){
		return jdbcDao.quertListMap(sql);
	}
	protected String queryForString(String sql){
		return jdbcDao.query4String(sql);
	}
	/**
	 * 查新表2列 第一列是key第二列是value的一个map
	 */
	protected Map<String , String> quert2Colum4Map(String sql , String col1 , String col2){
		return jdbcDao.quert2Colum4Map(sql , col1 , col2);
	}
	/**
	 * 判断表的字段或者索引是否存在
	 * @param tablename 表名
	 * @param columnOrIndexName 字段名, 或者索引名
	 * @param isColumn true字段 false索引
	 * @return boolean true存在 false 不存在
	 */
	protected boolean existColumnOrIndex(String tablename,String columnOrIndexName,boolean isColumn){
		boolean result = false;
		Connection conn = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		try {
			conn = jdbcDao.getConn();
			dbmd = conn.getMetaData();
			String schemaName = getSchemaName(dbmd);
			if(isColumn){
				rs = dbmd.getColumns(null, schemaName, tablename, columnOrIndexName);
				if(rs.next()){
					result = true;
				}
			}else{
				rs = dbmd.getIndexInfo(null, schemaName, tablename, false, false);
				while (rs.next()) {
					String indexName = rs.getString(6);
					if(indexName!=null&&indexName.equals(columnOrIndexName)){
						result = true;
						break;
					}
				}
			}
		}catch(Exception ex){
			log.error(ex.getMessage());
		}finally{
			try {
				dbmd = null;
				rs.close();
				conn.close();
			} catch (SQLException e) {
				log.error("获取ConnectionMetaData关闭链接错误!");
			}
		}
		return result;
	}
	
	/**
	 * 根据表字段是否可以为空
	 */
	protected boolean validateColumnIsNULL(String tablename,String columnName){
		boolean result = false;
		Connection conn = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		try {
			conn = jdbcDao.getConn();
			dbmd = conn.getMetaData();
			String schemaName = getSchemaName(dbmd); 
			rs = dbmd.getColumns(null, schemaName , tablename, columnName);
			if(rs.next()){
				String notnull = rs.getString(11);
				result = notnull!=null&&notnull.equals("1");
			}
		}catch(Exception ex){
			log.error(ex.getMessage());
		}finally{
			try {
				dbmd = null;
				rs.close();
				conn.close();
			} catch (SQLException e) {
				log.error("获取ConnectionMetaData关闭链接错误!");
			}
		}
		return result;
	}
	
	/**
	 * 执行sql文件
	 */
	protected boolean runScript(Reader reader){
		boolean result = false;
		Connection conn = null;
		try {
			conn = jdbcDao.getConn();
			ScriptRunner runner = new ScriptRunner(conn);  
			runner.setErrorLogWriter(null);  
			runner.setLogWriter(null);  
			runner.runScript(reader);  
			result = true;
		}catch(Exception ex){
			log.error(ex.getMessage() + "执行sql文件错误" , ex);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				log.error(e.getMessage() + "获取ConnectionMetaData关闭链接错误!" , e);
			}
		}
		return result;
	}
	
	/**
	 * 获取表模式 private
	 */
	private String getSchemaName(DatabaseMetaData dbmd) throws SQLException{
		String schemaName;
		switch (getDatabaseType().getValue()) {
		case 1://mssql
			schemaName = sqlserverSchemaName;
			break;
		case 4://h2
			schemaName = null;
			break;
		default:
			schemaName = dbmd.getUserName();
			break;
		}
		return schemaName;
	}
	
	protected void execSql(String sql){
		jdbcDao.excute(sql);
	}
	
	/**
	 * 获取数据库参数 数据库类型名称,时间
	 */
	protected String getSysdate(){
		if(sysdate!=null){
			return sysdate;
		}
		try {
			String databaseType = getDBTyeStr();
			if(databaseType!=null&&databaseType.equals("Microsoft SQL Server")){
				sysdate = "GETDATE()";
			}else if(databaseType!=null&&databaseType.equals("Oracle")){
				sysdate = "SYSDATE";
			}else if(databaseType!=null&&databaseType.equals("Db2")){
				sysdate = "CURRENT TIMESTAMP";
			}else if(databaseType!=null&&databaseType.equals("MySQL")){
				sysdate = "NOW()";
			}else if(databaseType!=null&&databaseType.equals("H2")){
				sysdate = "current_timestamp";
			}
		} catch (Exception e) {
			log.error("get database time is error!");
		}
		return sysdate;
	}
	
	@Autowired
	private JdbcDao jdbcDao;
	@Autowired
	@Value("${sqlserverSchemaName}")
	private String sqlserverSchemaName;
	private String sysdate = null;
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
