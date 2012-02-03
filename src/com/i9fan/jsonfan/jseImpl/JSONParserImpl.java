package com.i9fan.jsonfan.jseImpl;


import java.io.StringReader;
import java.util.List;
import java.util.Map;

import com.i9fan.jsonfan.interfaces.JSONParser;
import com.i9fan.jsonfan.interfaces.JSONValue;
import com.i9fan.jsonfan.jseImpl.simple.ContainerFactory;
import com.i9fan.jsonfan.jseImpl.simple.JSONParserSimple;
import com.i9fan.jsonfan.jseImpl.simple.ParseException;

public class JSONParserImpl implements JSONParser{

	JSONParserSimple parser = new JSONParserSimple();
	
	@Override
	public JSONValue parseLenient(String json) {
		return parseStrict(json);
	}

	@Override
	public JSONValue parseStrict(String json) {
		Object obj = null;
		try {
			obj = parser.parse(json,new ContainerFactory() {
				@Override
				public Map createObjectContainer() {
					return new JSONObjectImpl();
				}
				
				@Override
				public List creatArrayContainer() {
					return new JSONArrayImpl();
				}
			});
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (obj instanceof JSONValue ) return (JSONValue) obj;
		return null;
	}

}
