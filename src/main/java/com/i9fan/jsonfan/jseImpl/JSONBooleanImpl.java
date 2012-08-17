package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONBoolean;

public class JSONBooleanImpl extends JSONValueImpl implements JSONBoolean {

	private boolean value;

	private static JSONBooleanImpl jsontrue = new JSONBooleanImpl(true);
	private static JSONBooleanImpl jsonfalse = new JSONBooleanImpl(true);
	
	private JSONBooleanImpl(boolean value) {
		super();
		this.value = value;
	}

	@Override
	public JSONBoolean isBoolean() {
		return this;
	}

	public static JSONBoolean getInstance(boolean b) {
		
		return b ? jsontrue : jsonfalse;
	}

	@Override
	public boolean booleanValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public String toString() {
		return value ? "true": "false";
	}

}
