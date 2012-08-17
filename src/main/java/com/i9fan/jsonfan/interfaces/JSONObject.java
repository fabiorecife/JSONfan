package com.i9fan.jsonfan.interfaces;

public interface JSONObject extends JSONValue {
	
	boolean containsKey(String key);
	
	JSONValue get(String key);
	
	
}
