package com.cgi.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] invalidLoginData() {
		String[][] data = new String[2][3];

		data[0][0] = "john";
		data[0][1] = "john123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "bala";
		data[1][1] = "bala123";
		data[1][2] = "Invalid credentials";

		return data;
	}
	
	@DataProvider
	public String[][] commonDataProvider() throws IOException
	{
		//test method name is the sheetname
		String[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/test-data/hr_test_data.xlsx", "invalidLoginTest");
		return data;
	}
}
