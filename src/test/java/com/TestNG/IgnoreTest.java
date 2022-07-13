package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	private void mobiles() {
		System.out.println("mobiles");
	}
	@Test(enabled=true)
	private void laptops() {
		System.out.println("laptops");
	}
	@Test(enabled=false)
	private void earphones() {
		System.out.println("earphones");

	}
	@Test
	@Ignore
	private void tablets() {
		System.out.println("tablets");
	}
}
