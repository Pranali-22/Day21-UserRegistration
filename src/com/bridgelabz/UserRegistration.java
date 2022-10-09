/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dell
 * UC11 - Write JUnit Parameterised Test to
 * validate multiple entry for the Email Address.
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
	public static boolean validateFirstName(String firstName) {
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(firstName);
		return matcherObj.matches();
	}
					
	//Validate last name
	public static boolean validateLastName(String lastName) {
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(lastName);
		return matcherObj.matches();
	}
		
	//Validate email address
	public static boolean validateEmailAddress(String emailId) {
		String newRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(emailId);
		return matcherObj.matches();
	}

		
	//Validate mobile number
	public static boolean validateMobileNumber(String mobileNumber) {
		String newRegex = "[0-9]{2} [0-9]{10}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(mobileNumber);
		return matcherObj.matches();
	}
		
	//Validate password to have exact 1 special character
	public static boolean validatePassword(String password) {
		String newRegex = "[A-Z]{1,}[a-zA-Z0-9]{5,}[!@#$&*]{1,}[0-9]{1,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(password);
		return matcherObj.matches();
	}
		
	//Validate User Registration
	public boolean validateUserRegistration() {
		boolean isValidFirstName = validateFirstName(this.firstName);
		boolean isValidLastName = validateLastName(this.lastName);
		boolean isValidEmailId = validateEmailAddress(this.emailId);
		boolean isValidMobileNumber = validateMobileNumber(this.mobileNumber);
		boolean isValidPassword = validatePassword(this.password);
		
		return(isValidFirstName && isValidLastName && isValidEmailId && isValidMobileNumber && isValidPassword);
	}
	
}
