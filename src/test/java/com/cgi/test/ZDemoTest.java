package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//no need to create demo test
public class ZDemoTest {

	@DataProvider
	public String[][] validData() {
		String[][] data = new String[3][2];
		// i--> number of test cases
		// j-->number of parameters

		data[0][0] = "saul";
		data[0][1] = "saul123";

		data[1][0] = "peter";
		data[1][1] = "peter123";

		data[2][0] = "kimr";
		data[2][1] = "kim123";

		return data;
	}

	@Test(dataProvider = "validData")
	public void validTest(String username, String password) {
		System.out.println("login"+username+password);
	}

}
