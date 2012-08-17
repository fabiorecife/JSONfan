package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONNumber;
import com.i9fan.jsonfan.jseImpl.JSONNumberImpl;

public class TestJSONNumber {

	@Test
	public void teste_doubleValue() {
		JSONNumber json = new JSONNumberImpl(2.0d);
		assertEquals(2.0d, json.doubleValue(),0.0001);
		JSONNumber json2 = new JSONNumberImpl(2.0d);
		assertEquals(json2,json);
	}

	@Test
	public void teste_equals() {
		JSONNumber json = new JSONNumberImpl(2.0d);
		JSONNumber json2 = new JSONNumberImpl(2.0d);
		assertEquals(json2,json);
	}

	@Test
	public void teste_hash() {
		JSONNumber json = new JSONNumberImpl(2.0d);
		JSONNumber json2 = new JSONNumberImpl(2.0d);
		assertEquals(json2,json);
	}

	@Test
	public void teste_toString() {
		JSONNumber json = new JSONNumberImpl(2.0d);
		assertEquals("2",json.toString());
		json = new JSONNumberImpl(2.1d);
		assertEquals("2.1",json.toString());
	}
	
	
}
