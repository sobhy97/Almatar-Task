package tests;

import org.testng.annotations.Test;

public class RegistrationTest extends Testbase {
	

	@Test
	public void openLoginScreen()
	{
		registrationPage.navigateToSignUpPage("test","test","P@ssword","test5090@test.com","533111278");
	}

}
