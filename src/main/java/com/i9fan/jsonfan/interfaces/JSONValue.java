package com.i9fan.jsonfan.interfaces;

public interface JSONValue {

	JSONArray isArray();

	JSONBoolean isBoolean();

	JSONString isString();

	JSONNumber isNumber();

	JSONObject isObject();

	JSONNull isNull();
}
