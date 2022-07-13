package com.TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethods {

	@Test
	private void browserLaunch() {
		System.out.println("browserLaunch");
	}
	@Test(dependsOnMethods="browserLaunch")
	private void url() {
		System.out.println("url");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods="url")
	private void login() {
		System.out.println("login");
		Assert.fail();
	}
	@Test(dependsOnMethods="login")
	private void logout() {
		System.out.println("logout");
	}
	
	
	
	
	
}
