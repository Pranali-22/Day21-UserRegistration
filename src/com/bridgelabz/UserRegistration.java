/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dell
 * UC12 - Refactor the Code to throw custom
 * exceptions in case of
 * Invalid User Details - Rewrite all Test Cases to take in Custom
 */

public class UserRegistration {
	String firstName, lastName, emailId, mobileNumber, password;
	
	public UserRegistration() {
		
	}
		
	//Parameterized constructor
	public UserRegistration(String firstName, String lastName, String emailId, String mobileNumber, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	
	//Validate first name
	public static boolean validateFirstName(String firstName) throws InvalidInputException{
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(firstName);
		if(matcherObj.matches() == false) {
			throw new InvalidInputException("Invalid First Name");
		}
		return matcherObj.matches();
	}
					
	//Validate last name
	public static boolean validateLastName(String lastName) throws InvalidInputException{
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(lastName);
		if(matcherObj.matches() == false) {
			throw new InvalidInputException("Invalid Last Name");
		}
		return matcherObj.matches();
	}
		
	//Validate email address
	public static boolean validateEmailAddress(String emailId) throws InvalidInputException{
		String newRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(emailId);
		if(matcherObj.matches() == false) {
			throw new InvalidInputException("Invalid Email Id");
		}
		return matcherObj.matches();
	}

		
	//Validate mobile number
	public static boolean validateMobileNumber(String mobileNumber) throws InvalidInputException{
		String newRegex = "[0-9]{2} [0-9]{10}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(mobileNumber);
		if(matcherObj.matches() == false) {
			throw new InvalidInputException("Invalid mobile number");
		}
		return matcherObj.matches();
	}
		
	//Validate password to have exact 1 special character
	public static boolean validatePassword(String password) throws InvalidInputException{
		String newRegex = "[A-Z]{1,}[a-zA-Z0-9]{5,}[!@#$&*]{1,}[0-9]{1,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(password);
		if(matcherObj.matches() == false) {
			throw new InvalidInputException("Invalid Password");
		}
		return matcherObj.matches();
	}
		
		
	//validate fields using exceptions
	
	public void validateFirstNameWithException(String firstName) {
		try {
			validateFirstName(firstName);			
		}
		catch(InvalidInputException e){
			System.out.println(e.exceptionMessage);
		}
	}
	
	public void validateLastNameWithException(String lastName) {
		try {
			validateLastName(lastName);
		}
		catch(InvalidInputException e){
			System.out.println(e.exceptionMessage);
		}
	}
	
	public void validateEmailIdWithException(String emailId) {
		try {
			validateEmailAddress(emailId);
		}
		catch(InvalidInputException e){
			System.out.println(e.exceptionMessage);
		}
	}
	
	public void validateMobileNumberWithException(String mobileNumber) {
		try {
			validateMobileNumber(mobileNumber);
		}
		catch(InvalidInputException e){
			System.out.println(e.exceptionMessage);
		}
	}
	
	public void validatePasswordWithException(String password) {
		try {
			validatePassword(password);
		}
		catch(InvalidInputException e){
			System.out.println(e.exceptionMessage);
		}
	}
	
}
