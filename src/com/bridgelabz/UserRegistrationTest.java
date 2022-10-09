/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * UC11 - Write JUnit Parameterised Test to
 * validate multiple entry for the Email Address.
 */
class UserRegistrationTest {

	@Test
	void check_user_registration_is_valid_or_not() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();		
		
		System.out.println("Enter email address");
		String emailId = input.nextLine();
		
		System.out.println("Enter mobile number");
		String mobileNumber = input.nextLine();
		
		System.out.println("Enter password");
		String password = input.nextLine();
		
		UserRegistration userRegistration = new UserRegistration(firstName, lastName, emailId, mobileNumber, password);
				
		Assert.assertTrue("Sad",userRegistration.validateUserRegistration());		
	}
	
	//Test case to Validate multiple email ids
	@Test
	void validate_multiple_email_addresses() {
		List<String> emailList = new ArrayList<String>(Arrays.asList("abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc@1.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com.com","abc@%*.com"));
		UserRegistration userRegistration = new UserRegistration();
		
		for(String emailID : emailList) {
			if(userRegistration.validateEmailAddress(emailID)) {
				Assert.assertTrue("Invalid email id", userRegistration.validateEmailAddress(emailID));
			}
			
		}
	}
}
