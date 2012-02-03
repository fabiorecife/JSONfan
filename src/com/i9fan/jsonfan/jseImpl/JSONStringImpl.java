package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONString;

public class JSONStringImpl extends JSONValueImpl implements JSONString {


	@Override
	public JSONString isString() {
		return this;
	}

}
