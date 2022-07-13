package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	private void crendentials(@Optional("Vel")String username,@Optional("vel12")String password) {
	System.out.println(username);
	System.out.println(password);

	}
	
	
	
}
