package com.i9fan.jsonfan.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.i9fan.jsonfan.interfaces.JSONArray;
import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.interfaces.JSONNull;
import com.i9fan.jsonfan.interfaces.JSONNumber;
import com.i9fan.jsonfan.interfaces.JSONObject;
import com.i9fan.jsonfan.interfaces.JSONString;
import com.i9fan.jsonfan.interfaces.JSONValue;
import com.i9fan.jsonfan.jseImpl.JSONArrayImpl;
import com.i9fan.jsonfan.jseImpl.JSONBooleanImpl;
import com.i9fan.jsonfan.jseImpl.JSONNullImpl;
import com.i9fan.jsonfan.jseImpl.JSONNumberImpl;
import com.i9fan.jsonfan.jseImpl.JSONObjectImpl;
import com.i9fan.jsonfan.jseImpl.JSONStringImpl;

public class TestJSONValue {

	JSONValue value ;
	
	@Before
	public void setup() {
		value = new JSONValue() {

			@Override
			public JSONArray isArray() {
				
				return new JSONArrayImpl();
			}

			@Override
			public JSONBoolean isBoolean() {
				return JSONBooleanImpl.getInstance(true);
			}

			@Override
			public JSONString isString() {
				return new JSONStringImpl("");
			}

			@Override
			public JSONNumber isNumber() {
				return new JSONNumberImpl(2.0d);
			}

			@Override
			public JSONObject isObject() {
				return new JSONObjectImpl();
			}

			@Override
			public JSONNull isNull() {
				return JSONNullImpl.getInstance();
			}
			
		};
	}
	
	@Test
	public void testIsArray() {
		assertTrue(value.isArray() instanceof JSONArray);
	
	}

	@Test
	public void testIsBoolean() {
		assertTrue(value.isBoolean() instanceof JSONBoolean);
	}
	
	@Test 
	public void testIsString() {
		assertTrue(value.isString() instanceof JSONString);
	}

	@Test 
	public void testIsNumber() {
		assertTrue(value.isNumber() instanceof JSONNumber);
	}

	@Test 
	public void testIsObject() {
		assertTrue(value.isObject() instanceof JSONObject);
	}
	
	@Test 
	public void testIsNull() {
		assertTrue(value.isNull() instanceof JSONNull);
	}
	
	
}
