package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	@Test(priority= -1,retryAnalyzer=MyRetryAnalyser.class)
	private void facebooklaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\TestNgFramework\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUxNzYxMDE1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
        String expectedurl= "https://www.instagram.com/accounts/login/";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
	}
	
	
}
