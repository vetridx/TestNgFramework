package com.TestNG;

import org.testng.annotations.Test;

public class GroupsTest {

	@Test(groups="socialmedia")
	private void facebook() {
		System.out.println("facebook");
	}
	@Test(groups="socialmedia")
	private void instagram() {
		System.out.println("instagram");
	}
	@Test(groups="ecommerce",dependsOnGroups="socialmedia")
	private void flipcart() {
		System.out.println("flipcart");
	}
	@Test(groups="ecommerce",dependsOnGroups="socialmedia")
	private void amazon() {
		System.out.println("amazon");
	}
	@Test(groups="messenger",dependsOnGroups="ecommerce")
	private void whatsapp() {
		System.out.println("whatsapp");
	}
	@Test(groups="messenger",dependsOnGroups="ecommerce")
	private void telegram() {
		System.out.println("telegram");
	}
	
	
	
	
}
