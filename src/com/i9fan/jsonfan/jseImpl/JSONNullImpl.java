package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONBoolean;
import com.i9fan.jsonfan.interfaces.JSONNull;

public class JSONNullImpl extends JSONValueImpl implements JSONNull {

	static JSONNull jsonnull = new JSONNullImpl();
	
	private JSONNullImpl() {
		super();
	}

	public static JSONNull getInstance() {
		
		return jsonnull;
	}

	@Override
	public JSONNull isNull() {
		return this;
	}

	@Override
	public String toString() {
		return "null";
	}
	

}
