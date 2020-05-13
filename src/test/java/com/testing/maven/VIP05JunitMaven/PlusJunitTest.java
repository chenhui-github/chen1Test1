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

//这是一个参数化的测试类，用于测试Plus.java文件夹里面的int类型的sum()方法
//RunWith注解
@RunWith(Parameterized.class)
public class PlusJunitTest {
	private static Plus pl;
	private static String caseName;
	private static String resultMsg;
	private static int x;
	private static  int y;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//实例化
		pl=new Plus();
	}
	
	//构造函数(给参数赋值)
	public PlusJunitTest(String csName,String msg,int xi,int yi) {
		x=xi;
		y=yi;
		resultMsg=msg;
		caseName=csName;
		// TODO Auto-generated constructor stub
	}
	
	
	//测试方法
	@Test
	public void test() {
		//fail("Not yet implemented");
		int res=pl.Sum(x, y);
		System.out.println(res);
		assertEquals(resultMsg, res+"");
		/*最终输出结果如下：
		 *   2147483647
			-2147483648
			-2147483647
		 * */
	}
	
	//参数化方法
	@Parameters(name="{0}")
	public static Object[][] initData(){
	Object[][] data=new Object[][] {
			{ "左边界-1", "-2147483649", -2147483648,-1}, //,3.6,1.5,5.1
			{ "左边界+0", "-2147483648", -2147483648, 0 },//,3.6,1.5,5.0
			{ "左边界+1", "-2147483647", -2147483648, 1 } //,3.6,1.5,5.1
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
