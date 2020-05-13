package com.testing.maven.VIP05JunitMaven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//这是一个测试套件类可以一次性执行多个测试类(PlusDoubleTest，PlusJunitTest，LoginParamTest)
@RunWith(Suite.class)
@SuiteClasses({ PlusDoubleTest.class, PlusJunitTest.class,com.testing.maven.VIP05JunitMaven.LoginParamTest.class })
public class PlusAllTests {

}
