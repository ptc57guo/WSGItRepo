package com.iterator;

public class ObjectTest<T> implements IObjectTest<T> {

	@Override
	public boolean matches(T element) {
		if (element instanceof Object)
			return true;
		else
			return false;
	}

}
