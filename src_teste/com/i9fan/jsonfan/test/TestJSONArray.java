package com.i9fan.jsonfan.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONArray;
import com.i9fan.jsonfan.jseImpl.JSONArrayImpl;
import com.i9fan.jsonfan.jseImpl.JSONNumberImpl;

public class TestJSONArray {

	private JSONArray json;
	private JSONNumberImpl number0 ;
	@Before
	public void setup() {
		json = new JSONArrayImpl();
		number0 = new JSONNumberImpl(0);
		json.set(0,number0);
	}

	@Test
	public void test_isArray() {
		assertTrue(json.isArray() != null);
	}

	@Test
	public void test_set() {
		json.set(1,new JSONNumberImpl(1));
		assertEquals(new JSONNumberImpl(1), json.get(1));
	}
	
	@Test
	public void test_get() {
		assertEquals(new JSONNumberImpl(0), json.get(0));
	}
	
	@Test
	public void test_size() {
		assertEquals(1, json.size());
	}
	
	@Test
	public void test_equals() {
		assertEquals(json, json);
		JSONArray json2 = new JSONArrayImpl();
		json2.set(0,number0);
		assertNotSame(json, json2);
	}
}
