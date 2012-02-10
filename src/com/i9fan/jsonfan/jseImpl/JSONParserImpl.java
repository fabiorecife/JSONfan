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

				@Override
				public JSONValue createValue(Object value) {
					JSONValue result = null;
					if (value instanceof String) {
						result = new JSONStringImpl((String)value);
					} else if (value instanceof Boolean) {
						result = JSONBooleanImpl.getInstance(((Boolean) value).booleanValue());
					}  else if (value instanceof Double){
						result = new JSONNumberImpl((Double) value);
					}  else if (value instanceof Long){
						result = new JSONNumberImpl (((Long) value).doubleValue());
						
					}
					return result;
				}
			});
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (obj instanceof JSONValue ) return (JSONValue) obj;
		return null;
	}

}
