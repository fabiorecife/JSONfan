package com.i9fan.jsonfan.jseImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.i9fan.jsonfan.interfaces.JSONArray;
import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.interfaces.JSONNull;
import com.i9fan.jsonfan.interfaces.JSONNumber;
import com.i9fan.jsonfan.interfaces.JSONObject;
import com.i9fan.jsonfan.interfaces.JSONString;
import com.i9fan.jsonfan.interfaces.JSONValue;


public class JSONArrayImpl extends ArrayList<JSONValue> implements List<JSONValue>, JSONArray {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public JSONArray isArray() {
		return this;
	}

	@Override
	public JSONBoolean isBoolean() { return null; }

	@Override
	public JSONString isString() { return null; }

	@Override
	public JSONNumber isNumber() { return null; }

	@Override
	public JSONObject isObject() { return null; }

	@Override
	public JSONNull isNull() { return null; }

	@Override
	public JSONValue set(int index, JSONValue jsonvalue) {
		if (size() > index) {
			return super.set (index, jsonvalue);
		} else {
			add(jsonvalue);
		}
		return jsonvalue;
	}

	@Override
	public JSONValue get(int index) {
		return super.get(index);
	}
	
	
}
