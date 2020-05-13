package com.testing.maven.VIP05JunitMaven;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//该类是一个参数化测试类，用于测试LoginSample.java中的Login()方法
//进行junit参数化数据驱动
//写在测试类外面的@runwith注解
@RunWith(Parameterized.class)
public class LoginParamTest {
	
	private static LoginSample ls;
	//成员变量用于从@parameters方法中接收相关参数
	private static String user;
	private static String pwd;
	private static String msg;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("***start*****ParamTest********-");
		//实例化
		ls=new LoginSample();
	}
	
		//构造方法用于完成成员变量的赋值操作
	public  LoginParamTest(String username,String pswd,String resmsg) {
		user=username;
		pwd=pswd;
		msg=resmsg;
	}
	
	//@test方法使用成员变量运行
	@Test
	public void test() {
		ls.login(user, pwd);
	}

	//生成和返回测试数据供测试类使用，通常返回Object二维数组
	@Parameters(name="用户名：{0},密码：{1},预期结果：{2}")
	public static Object[][] LoginData(){
		Object[][] data=new Object[][] {
			{"Roy","123456","恭喜你，登陆成功！！"},
			{"roy","123456","用户名或密码错误！"},
			{"r","123456","用户名密码"},
			{null,"123456","用户名密码不能为空！"},
			{"Roy","1345677777777777777","用户名密码长度应是3-16位！"}
		};
		return data;	
	}
	/*
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
*/
}
