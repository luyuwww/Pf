package cn.ly;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ly.pojo.PfUser;
import cn.ly.service.i.ArcService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/test*.xml" })
public class BackLogTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private ArcService arcServcieImpl;
	@Test
	public void test01(){
		List<PfUser>  userList = arcServcieImpl.listAllUser();
		for (PfUser pfUser : userList) {
			System.out.println(pfUser.getUemail());
			
		}
	}
	

	
	
}