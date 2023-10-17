package org.example.safe;

public class Hello {
	private final String word;

	public Hello(String word) {
		this.word = word;
	}

	public void say() {
		System.out.println("Hello " + word + "!");
	}

	public String getWord() {
		return word;
	}
}
