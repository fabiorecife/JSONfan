package com.i9fan.jsonfan.interfaces;


public interface JSONArray extends JSONValue{

	JSONValue set(int index, JSONValue jsonvalue);

	JSONValue get(int index);

	int size();	

}
