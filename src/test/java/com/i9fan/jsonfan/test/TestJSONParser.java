package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONArray;
import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.interfaces.JSONObject;
import com.i9fan.jsonfan.interfaces.JSONParser;
import com.i9fan.jsonfan.interfaces.JSONValue;
import com.i9fan.jsonfan.jseImpl.JSONNumberImpl;
import com.i9fan.jsonfan.jseImpl.JSONObjectImpl;
import com.i9fan.jsonfan.jseImpl.JSONParserImpl;


public class TestJSONParser {

	JSONParser parser;
	
	@Before
	public void setup() {
		parser = new JSONParserImpl();
	}
	
	@Test	
	public void test_parseStrict() {
		assertTrue(parser.parseStrict("{}") != null);
		JSONValue value = parser.parseStrict("{}");
		assertTrue(value instanceof JSONObject);
		assertTrue(value.isObject() != null);
	}

	@Test	
	public void test_parseLenient() {
		assertTrue(parser.parseLenient("{}") != null);
	}

	@Test
	public void test_ObjectWithNumber() {
		JSONValue json = parser.parseStrict("{\"teste\":1}");
		assertTrue(json instanceof JSONValue);
		assertTrue(json.isObject() != null);
		assertEquals(new JSONNumberImpl(1), json.isObject().get("teste"));
		assertEquals(1.0,json.isObject().get("teste").isNumber().doubleValue(),0.001);
		
	}
	
}
