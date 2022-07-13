package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@Test(dataProvider="testdata")
	private void credentials(String username,String password) {
		System.out.println(username);
		System.out.println(password);

	}
	
	@DataProvider
	private Object testdata() {
		return new Object[][] {{"arun","test@123"},{"vetri","vel123"}};

	}
	
	
}
