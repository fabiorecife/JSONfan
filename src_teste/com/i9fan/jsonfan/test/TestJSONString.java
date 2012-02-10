package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONString;
import com.i9fan.jsonfan.jseImpl.JSONStringImpl;

public class TestJSONString {

	
	
	private JSONString json;
	@Before
	public void setup() {
		json = new JSONStringImpl("teste");
	}

	@Test
	public void test() {
		
	}
	
	@Test
	public void test_stringValue() {
		setup();
		assertEquals("teste", json.stringValue());
	}

	
	@Test
	public void test_isString() {
		assertTrue(json.isString() instanceof JSONString);
	}
	
	@Test
	public void test_toString() {
		assertEquals("\"teste\"", json.toString());
	}
	
	@Test
	public void test_hashCode() {
		JSONString json2 = new JSONStringImpl("teste");
		assertEquals(json.hashCode(), json2.hashCode());
	}
	
	
	@Test
	public void test_equals() {
		JSONString json2 = new JSONStringImpl("teste");
		assertTrue(json.equals(json2));
		
	}
	
}
