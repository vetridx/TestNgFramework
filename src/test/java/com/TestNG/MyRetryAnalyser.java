package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyser implements IRetryAnalyzer {

	int start=1,end=3;
	public boolean retry(ITestResult result) {
		if (start<=end) {
			start++;
			return true;
		}
		return false;
	}

}
