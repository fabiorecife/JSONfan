package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONNull;
import com.i9fan.jsonfan.jseImpl.JSONNullImpl;

public class TestJSONNull {

	@Test
	public void test_isNull() {
		JSONNull json = JSONNullImpl.getInstance();
		assertEquals(json.isNull() ,JSONNullImpl.getInstance() );
	}
	@Test
	public void test_toString() {
		JSONNull json = JSONNullImpl.getInstance();
		assertEquals("null", json.isNull().toString() );
	}
}
