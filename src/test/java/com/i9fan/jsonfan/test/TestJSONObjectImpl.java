package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONValue;
import com.i9fan.jsonfan.jseImpl.JSONNumberImpl;
import com.i9fan.jsonfan.jseImpl.JSONObjectImpl;

public class TestJSONObjectImpl {

	@Test
	public void test_get() {
		JSONObjectImpl json = new JSONObjectImpl();
		json.put("teste", new JSONNumberImpl(2.0));
		assertEquals(true, json.get("teste") instanceof JSONValue);
	}
	
	@Test
	public void test_containsKey() {
		JSONObjectImpl json = new JSONObjectImpl();
		json.put("teste",  new JSONNumberImpl(1));
		assertEquals(true, json.containsKey("teste"));
	}
	
	@Test
	public void test_isObject() {
		JSONObjectImpl json = new JSONObjectImpl();
		assertEquals(true, json.isObject() != null);
	}
	
	@Test
	public void test_isArray() {
		JSONObjectImpl json = new JSONObjectImpl();
		assertEquals(true, json.isArray() == null);
	}
	
	@Test
	public void test_isString() {
		JSONObjectImpl json = new JSONObjectImpl();
		assertEquals(true, json.isString() == null);
	}
	
	@Test
	public void test_isNumber() {
		JSONObjectImpl json = new JSONObjectImpl();
		assertEquals(true, json.isNumber() == null);
	}
	
//	@Test
//	public void test_toString() {
//		JSONObjectImpl json = new JSONObjectImpl();
//		
//	}
	
}
