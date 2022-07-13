package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsert_Conept {

	@Test
	@Ignore
	private void demo() {
	   String actual = "Welcome";
	   String expected="Java";
	   SoftAssert  s = new SoftAssert();
	   s.assertEquals(actual, expected);

}
	@Test
	private void demo1() {
		String actual = "Welcome";
		String expected="Welcome";
		Assert.assertEquals(actual, expected);
	}
	
	
	
}
