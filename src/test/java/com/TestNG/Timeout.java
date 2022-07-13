package com.TestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut=1000)
	private void launch() throws InterruptedException {
		System.out.println("chrome");
     Thread.sleep(900);
	}
	@Test(expectedExceptions=NoSuchElementException.class)
	private void login() {
		System.out.println("finding the element is not in the webpage");
     throw new NoSuchElementException("null");
	}
}
