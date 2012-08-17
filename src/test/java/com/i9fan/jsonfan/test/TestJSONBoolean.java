package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.jseImpl.JSONBooleanImpl;

public class TestJSONBoolean {

	@Test
	public void test_booleanValue() {
		JSONBoolean json = JSONBooleanImpl.getInstance(true);
		assertTrue(json.booleanValue());
	}

	@Test
	public void test_isBoolean() {
		JSONBoolean json = JSONBooleanImpl.getInstance(true);
		assertEquals(json.isBoolean(), JSONBooleanImpl.getInstance(true));
	}
	
	@Test
	public void test_toString() {
		JSONBoolean json = JSONBooleanImpl.getInstance(true);
		assertEquals("true", json.toString());
	}
	
}
