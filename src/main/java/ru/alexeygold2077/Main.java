package ru.alexeygold2077;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		TestClass testClass = new TestClass();
		Serializator<TestClass> serializator = new Serializator<>(testClass, "obj.bin");

		try {
			serializator.Serialize();
		} catch (IOException ioe) {}
	}
}
