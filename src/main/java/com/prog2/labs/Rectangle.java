package com.prog2.labs;

public interface Rectangle {
	int getWidth();

	int getHeight();

	default int getArea() {
		return getWidth() * getHeight();
	}
}
