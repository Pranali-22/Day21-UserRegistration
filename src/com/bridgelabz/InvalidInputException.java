/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class InvalidInputException extends Exception{
	String exceptionMessage;

	public InvalidInputException(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
