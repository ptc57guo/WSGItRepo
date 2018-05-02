package com.iterator;

public class StringTest<T> implements IObjectTest<T> {

	@Override
	public boolean matches(T element) {
		if (element instanceof String)
			return true;
		else
			return false;
	}

}
