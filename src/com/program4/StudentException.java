package com.program4;

public class StudentException extends Exception{
	String message;

	public StudentException(String message) {
		super(message);
		this.message = message;
	}

	

}
