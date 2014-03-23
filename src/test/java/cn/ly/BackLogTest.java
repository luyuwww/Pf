package cn.ly;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ly.pojo.ViewGrade;
import cn.ly.service.i.ArcService;
import cn.ly.util.XlsUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/test*.xml" })
public class BackLogTest extends AbstractJUnit4SpringContextTests {
//	@Test
//	public void test01(){
//		arcServcieImpl.getTotalGrade();
//	}
	
	@Test
	public void test01(){
		List<ViewGrade> gradeList = arcServcieImpl.getTotalGrade();
		XlsUtils utile = new XlsUtils();
		try {
			utile.createWorkBook(gradeList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
//	public void test01(){
//		Map<String, Object> map = arcServcieImpl.getLevelCountMap("yanxin" , 1 , 1);
//		Set<String> keySet = map.keySet();
//		for (String key : keySet) {
//			System.out.println(key + " : " + map.get(key));
//			
//		}
//	}
	@Autowired
	private ArcService arcServcieImpl;
}
