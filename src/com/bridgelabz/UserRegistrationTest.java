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
 * UC10 - Write JUnit Test to validate the User
 * Entry for First Name, Last Name,
 * Email, Mobile, and Password.
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
	
}
