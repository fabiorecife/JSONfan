package com.i9fan.jsonfan.jseImpl.simple;

import java.util.List;
import java.util.Map;

import com.i9fan.jsonfan.interfaces.JSONValue;

/**
 * Container factory for creating containers for JSON object and JSON array.
 * 
 * @see com.i9fan.jsonfan.jseImpl.simple.JSONParserSimple#parse(java.io.Reader, ContainerFactory)
 * 
 * @author FangYidong<fangyidong@yahoo.com.cn>
 */
public interface ContainerFactory {
	/**
	 * @return A Map instance to store JSON object, or null if you want to use org.json.simple.JSONObject.
	 */
	Map<String,JSONValue> createObjectContainer();
	
	/**
	 * @return A List instance to store JSON array, or null if you want to use org.json.simple.JSONArray. 
	 */
	List<JSONValue> creatArrayContainer();
	
	
	JSONValue createValue(Object value);
}
