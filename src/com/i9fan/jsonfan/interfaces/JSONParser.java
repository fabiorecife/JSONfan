package com.i9fan.jsonfan.interfaces;

public interface JSONParser {
	JSONValue parseLenient(String json);
	JSONValue parseStrict(String json);
}
