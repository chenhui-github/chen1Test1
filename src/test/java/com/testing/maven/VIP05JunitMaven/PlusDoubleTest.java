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

//这是一个参数化的测试类，用于测试Plus.java文件夹里面的double类型的sum()方法
@RunWith(Parameterized.class)
public class PlusDoubleTest {
	private static Plus pl;
	
	private static Double x;
	private static Double y;
	private static Double res;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pl=new Plus();
	}

	//构造函数
	public PlusDoubleTest(Double d1,Double d2,Double d3) {
		// TODO Auto-generated constructor stub
		x=d1;
		y=d2;
		res=d3;
	}
	
	
	//测试方法
	@Test
	public void test() {
		Double d=pl.Sum(x, y);
		System.out.println(d);
		assertEquals(res, d);
		
		//fail("Not yet implemented");
	}
	
	//参数化方法
	@Parameters
	public static Object[][] initdata(){
		Object[][] data=new Object[][] {
			{3.6,1.5,5.1},
			{3.6,1.5,5.0},
			{3.6,1.5,5.1}
			
		};
	return data;	
	}
/*
 * @AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

 * */
}
