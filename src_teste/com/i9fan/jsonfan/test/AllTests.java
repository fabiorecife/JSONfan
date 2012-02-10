package com.i9fan.jsonfan.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestJSONParser.class, TestJSONValue.class , TestJSONObjectImpl.class, TestJSONNumber.class, 
	TestJSONBoolean.class, TestJSONNull.class, TestJSONString.class})
public class AllTests {

}
