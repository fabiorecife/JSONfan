package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONString;

public class JSONStringImpl extends JSONValueImpl implements JSONString {

	private String value;

	public JSONStringImpl(String string) {
		value = string;
	}

	@Override
	public JSONString isString() {
		return this;
	}

	@Override
	public String stringValue() {
		return value;
	}

	@Override
	public String toString() {
		return "\"" + value + "\"";
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof JSONString)) return false;
		JSONString json = (JSONString) obj;
		return value.equals(json.stringValue());
	}

}
