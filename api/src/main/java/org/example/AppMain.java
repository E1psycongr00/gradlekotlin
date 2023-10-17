package org.example;

import org.example.safe.Hello;

public class AppMain {
	public static void main(String[] args) {
		Hello hello = new Hello("world");
		hello.say();
	}
}
