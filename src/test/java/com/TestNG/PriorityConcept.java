package com.TestNG;

import org.testng.annotations.Test;

public class PriorityConcept {

	
	
	@Test(priority=1,invocationCount=2)
	private void browserlunch() {
		System.out.println("chrome");
	}
	@Test(priority=0,enabled=false)
	private void url() {
		System.out.println("url");
	}
	@Test(priority=-1)
	private void login() {
		System.out.println("login");


	}
	@Test(priority=2,enabled=false)
    private void logout() {
		System.out.println("logout");
	}
}

