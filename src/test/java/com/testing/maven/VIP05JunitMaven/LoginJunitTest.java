package com.testing.maven.VIP05JunitMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginJunitTest {


	@Test
	public void test() {
		//fail("Not yet implemented");
				System.out.println("--------LoginJunitTest---执行了-------");
				LoginSample ls=new LoginSample();
				ls.login("111", "222");
				System.out.println("-----------执行了-------");
	}

}
