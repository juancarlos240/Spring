package com.tzone.spring.exception;

public class ApplicationException extends Exception {
	
	public ApplicationException(){
		
	}
	
	public ApplicationException(String msg, Throwable cause){
		super(msg , cause);
	}

}
