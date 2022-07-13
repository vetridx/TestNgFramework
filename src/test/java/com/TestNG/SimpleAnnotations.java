package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@Test
	public void laptops() {
		System.out.println("Hp");
	}
	
	
	@Test
	public void mobiles() {
		System.out.println("vivo");
	}
	
	@Test
	public void tablets() {
		System.out.println("Asus");
	}
	@BeforeSuite
	public void setProperty() {
		System.out.println("setproperty");
	}
	@AfterSuite
	public void quit() {
		System.out.println("quit");
	}
	@BeforeTest
	public void check() {
		System.out.println("check");
	}
	@AfterTest
	public void reportcheck() {
		System.out.println("reportcheck");
	}
	@BeforeClass
	public void deletecookies() {
		System.out.println("deletecookies");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("closebrowser");
	}
}
