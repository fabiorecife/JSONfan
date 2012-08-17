package com.i9fan.jsonfan.jseImpl;

import com.i9fan.jsonfan.interfaces.JSONNumber;

public class JSONNumberImpl extends JSONValueImpl implements JSONNumber {
	private double value; 

	public JSONNumberImpl(double dvalue) {
		value = dvalue;
	}

	@Override
	public JSONNumber isNumber() {
		return this;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JSONNumberImpl other = (JSONNumberImpl) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (Math.floor(value) == value) return String.valueOf(Math.round(value));
		return String.valueOf(value);
	}

}
