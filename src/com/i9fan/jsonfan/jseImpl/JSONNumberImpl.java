package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONNumber;

public class JSONNumberImpl extends JSONValueImpl implements JSONNumber {


	@Override
	public JSONNumber isNumber() {
		return this;
	}

}
